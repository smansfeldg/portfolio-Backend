package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.persona;
import com.portfolio.SpringBoot.repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements IPersonaService{

    @Autowired
    public personaRepository persoRepo;
    
    @Override
    public List<persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPerosna(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
