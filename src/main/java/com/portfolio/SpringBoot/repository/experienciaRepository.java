package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository <experiencia, Long>{
    
}
