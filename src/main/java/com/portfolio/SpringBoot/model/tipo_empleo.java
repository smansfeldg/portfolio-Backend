package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class tipo_empleo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtipo_empleo;
    
    private String nombre_tipo;
    /*
    @OneToMany(mappedBy = "tipo_empleo")
    private List<experiencia> experiencias;*/
}
