package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository <persona, Long>{
    
}
