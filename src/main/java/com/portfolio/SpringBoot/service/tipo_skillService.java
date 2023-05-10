package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.tipo_skill;
import com.portfolio.SpringBoot.repository.tipo_skillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tipo_skillService implements iTipo_skillService{

    @Autowired
    public tipo_skillRepository tskillRepo;
            
    @Override
    public List<tipo_skill> verTipo_skill() {
        return tskillRepo.findAll();
    }

    @Override
    public void crearTipo_skill(tipo_skill tskill) {
        tskillRepo.save(tskill);
    }

    @Override
    public void borrarTipo_skill(Long idtipo_skill) {
        tskillRepo.deleteById(idtipo_skill);
    }

    @Override
    public tipo_skill buscarTipo_skill(Long idtipo_skill) {
        return tskillRepo.findById(idtipo_skill).orElse(null);
    }
    
}
