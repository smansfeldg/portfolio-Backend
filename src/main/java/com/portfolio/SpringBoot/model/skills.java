package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private persona persona;

    @ManyToOne
    @JoinColumn(name = "tipo_skill_idtipo_skill")
    private tipo_skill tipo_skill;
}
