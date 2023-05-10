package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ideducacion;
    
    private String institucion;
    private String titulo;
    private Date inicio;
    private Date fin; 
    private String descripcion; 
    private Long persona_id;
    
    public educacion(){}
    
    public educacion (Long ideducacion, String institucion, String titulo, 
            Date inicio, Date fin, String descripcion, Long persona_id){
        this.ideducacion = ideducacion;
        this.institucion = institucion;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }
}
