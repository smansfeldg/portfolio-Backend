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
public class proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproyectos;
    
    private String nombre;
    private String descripcion;
    private String url_refe;
    private String url_img;
    
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private persona persona;
}
