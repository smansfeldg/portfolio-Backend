package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.experiencia;
import com.portfolio.SpringBoot.repository.experienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experienciaService implements IExperienciaService{
    
    @Autowired
    public experienciaRepository expRepo;

    @Override
    public List<experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long idesperiencia) {
        expRepo.deleteById(idesperiencia);
    }

    @Override
    public experiencia buscarExperiencia(Long idesperiencia) {
        return expRepo.findById(idesperiencia).orElse(null);
    }
    
    
}
