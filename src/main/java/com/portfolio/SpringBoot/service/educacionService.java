package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.educacion;
import com.portfolio.SpringBoot.repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class educacionService implements IEducacionService{
    
    @Autowired
    public educacionRepository educRepo;

    @Override
    public List<educacion> verEducacion() {
        return educRepo.findAll();
    }

    @Override
    public void crearEducacion(educacion educ) {
        educRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Long ideducacion) {
        educRepo.deleteById(ideducacion);
    }

    @Override
    public educacion buscarEducacion(Long ideducacion) {
        return educRepo.findById(ideducacion).orElse(null);
    }
}
