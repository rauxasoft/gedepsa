package com.sinensia.productosboot.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.productosboot.backend.integration.model.EnvioPL;

@Repository
public interface EnvioPLRepository extends JpaRepository<EnvioPL, Integer>{

}
