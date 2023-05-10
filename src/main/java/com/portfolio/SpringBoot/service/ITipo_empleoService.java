package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.tipo_empleo;
import java.util.List;

public interface ITipo_empleoService {
    
    public List<tipo_empleo> verTipo_empleo();
    public void crearTipo_empleo (tipo_empleo empl);
    public void borrarTipo_empleo (Long idtipo_empleo);
    public tipo_empleo buscarTipo_empleo (Long idtipo_empleo);
}
