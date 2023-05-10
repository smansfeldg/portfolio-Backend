package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.tipo_skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipo_skillRepository extends JpaRepository <tipo_skill, Long>{
    
}
