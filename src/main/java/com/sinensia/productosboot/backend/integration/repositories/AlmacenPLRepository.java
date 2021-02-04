package com.sinensia.productosboot.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.productosboot.backend.integration.model.AlmacenPL;

@Repository
public interface AlmacenPLRepository extends JpaRepository<AlmacenPL, Integer>{

}
