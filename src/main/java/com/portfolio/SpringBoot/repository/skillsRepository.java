package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillsRepository extends JpaRepository <skills, Long>{
    
}
