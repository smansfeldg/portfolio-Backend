package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<proyectos> verProyectos();
    public void crearProyectos (proyectos proyec);
    public void borrarProyectos (Long idproyectos);
    public proyectos buscarProyectos (Long idproyectos);
}
