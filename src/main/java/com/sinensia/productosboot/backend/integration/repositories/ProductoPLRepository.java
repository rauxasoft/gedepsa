package com.sinensia.productosboot.backend.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sinensia.productosboot.backend.integration.model.FamiliaPL;
import com.sinensia.productosboot.backend.integration.model.ProductoPL;
import com.sinensia.productosboot.backend.integration.model.dtos.Producto1DTO;
import com.sinensia.productosboot.backend.integration.model.dtos.Producto2DTO;
import com.sinensia.productosboot.backend.integration.model.dtos.Producto3DTO;

@Repository
public interface ProductoPLRepository extends JpaRepository<ProductoPL,Integer>{

	public static final String DTOS_URL = "com.sinensia.productosboot.backend.integration.model.dtos.";
	
	@Query("SELECT p.nombre, p.familia, p.precio FROM ProductoPL p")
	public List<Object[]> findDatosTabla();
	
	@Query("SELECT p.nombre FROM ProductoPL p")
	public List<String> findNombres();
	
	@Query("SELECT p.nombre, p.precio, p.precio * 1.21 FROM ProductoPL p")
	public List<Object[]> findPreciosIva();
	
	@Query("SELECT DISTINCT p.familia from ProductoPL p ORDER BY p.familia DESC")
	public List<FamiliaPL> getFamilias();
	
	@Query("SELECT p.familia, "
		 + "       COUNT(*), "
		 + "       AVG(p.precio), "
		 + "       MAX(p.precio), "
		 + "       MIN(p.precio) "
		 + "FROM   ProductoPL p "
		 + "GROUP BY p.familia "
		 + "ORDER BY p.familia")
	public List<Object[]> getEstadisticaFamilias1();
	
	// *******************************************
	
	@Query("SELECT new " + DTOS_URL + "Producto1DTO (p.nombre, p.precio) FROM ProductoPL p")
	public List<Producto1DTO> getDTO1();
	
	@Query("SELECT new " + DTOS_URL + "Producto2DTO "
		 + "(CONCAT(UPPER(p.nombre),' (',p.familia,')'), p.precio, p.precio * 1.21) "
		 + "FROM ProductoPL p")
	public List<Producto2DTO> getDTO2();
	
	@Query("SELECT new " + DTOS_URL + "Producto3DTO "
			 + "(CONCAT(UPPER(p.nombre),' (',p.familia,')'), p.precio, p.precio * 1.21, p.descatalogado) "
			 + "FROM ProductoPL p")
	public List<Producto3DTO> getDTO3();
	
	// *******************************************
	
	@Query("SELECT p from ProductoPL p WHERE p.familia = :pfam AND p.descatalogado = true")
	public List<ProductoPL> findDescatalogadosByFamilia(@Param("pfam") FamiliaPL fam);
	
	@Query("SELECT p FROM ProductoPL p WHERE p.precio IN :precios")
	public List<ProductoPL> findWithPriceIn(List<Double> precios);
	

}
