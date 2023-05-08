package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.persona;
import java.util.List;

public interface IPersonaService {
    public List<persona> verPersona();
    public void crearPersona (persona per);
    public void borrarPerosna (Long id);
    public persona buscarPersona (Long id);
}
