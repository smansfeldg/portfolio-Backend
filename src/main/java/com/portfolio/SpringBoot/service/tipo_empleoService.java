package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.tipo_empleo;
import com.portfolio.SpringBoot.repository.tipo_empleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tipo_empleoService implements ITipo_empleoService{

    @Autowired
    public tipo_empleoRepository emplRepo;
    
    @Override
    public List<tipo_empleo> verTipo_empleo() {
        return emplRepo.findAll();
                }

    @Override
    public void crearTipo_empleo(tipo_empleo empl) {
        emplRepo.save(empl);
    }

    @Override
    public void borrarTipo_empleo(Long idtipo_empleo) {
        emplRepo.deleteById(idtipo_empleo);
    }

    @Override
    public tipo_empleo buscarTipo_empleo(Long idtipo_empleo) {
        return emplRepo.findById(idtipo_empleo).orElse(null);
    }
    
}
