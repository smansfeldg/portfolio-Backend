package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.proyectos;
import com.portfolio.SpringBoot.repository.proyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class proyectosService implements IProyectosService{

    @Autowired
    public proyectosRepository proyRepo;
    
    @Override
    public List<proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyectos(proyectos proyec) {
        proyRepo.save(proyec);
    }

    @Override
    public void borrarProyectos(Long idproyectos) {
        proyRepo.deleteById(idproyectos);
    }

    @Override
    public proyectos buscarProyectos(Long idproyectos) {
        return proyRepo.findById(idproyectos).orElse(null);
    }
    
}
