package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class tipo_skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtipo_skill;
    private String nombre_tipo;
}
