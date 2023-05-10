package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idskills;
    private String nombre;
    private String icon;
    private Long procentaje;
    private Long persona_id;
    private Long tipo_skill_idtipo_skill;
}
