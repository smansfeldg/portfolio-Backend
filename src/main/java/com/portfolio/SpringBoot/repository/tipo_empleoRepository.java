package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.tipo_empleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipo_empleoRepository extends JpaRepository <tipo_empleo, Long>{
    
}
