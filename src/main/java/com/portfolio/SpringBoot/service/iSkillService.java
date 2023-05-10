package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.skills;
import java.util.List;

public interface iSkillService {
    
    public List<skills> verSkills();
    public void crearSkills (skills skill);
    public void borrarSkills (Long idskills);
    public skills buscarSkills (Long idskills);
}
