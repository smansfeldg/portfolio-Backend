package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepository extends JpaRepository <proyectos, Long>{
    
}
