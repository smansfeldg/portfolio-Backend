package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.skills;
import com.portfolio.SpringBoot.repository.skillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class skillsService implements iSkillService{

    @Autowired
    public skillsRepository skillRepo;
            
    @Override
    public List<skills> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkills(skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkills(Long idskills) {
        skillRepo.deleteById(idskills);
    }

    @Override
    public skills buscarSkills(Long idskills) {
        return skillRepo.findById(idskills).orElse(null);
    }
    
}
