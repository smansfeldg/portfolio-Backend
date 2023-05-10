package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.tipo_skill;
import java.util.List;

public interface iTipo_skillService {
    
    public List<tipo_skill> verTipo_skill();
    public void crearTipo_skill (tipo_skill tskill);
    public void borrarTipo_skill (Long idtipo_skill);
    public tipo_skill buscarTipo_skill (Long idtipo_skill);
}
