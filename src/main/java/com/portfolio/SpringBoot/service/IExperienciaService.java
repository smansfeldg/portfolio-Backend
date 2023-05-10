package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<experiencia> verExperiencia();
    public void crearExperiencia (experiencia exp);
    public void borrarExperiencia (Long idesperiencia);
    public experiencia buscarExperiencia (Long idesperiencia);
}
