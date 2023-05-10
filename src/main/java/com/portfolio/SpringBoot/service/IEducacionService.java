package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<educacion> verEducacion();
    public void crearEducacion (educacion user);
    public void borrarEducacion (Long ideducacion);
    public educacion buscarEducacion (Long ideducacion);
}
