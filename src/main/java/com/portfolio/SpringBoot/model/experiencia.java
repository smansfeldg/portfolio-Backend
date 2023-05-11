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
public class experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idesperiencia;
    
    private String empresa;
    private String puesto;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String descripcion;
    private String url_img_refe;
    private String enlace_refe;
    private Long persona_id;
    private Long tipo_empleo_idtipo_empleo;
    /*
    public experiencia (){}
    
    public experiencia (Long idesperiencia, String empresa, String puesto, 
            Date fechaInicio, Date fechaFin, String descripcion, String url_img_refe,
            String enlace_refe, Long persona_id, Long tipo_empleo_idtipo_empleo){
        this.idesperiencia = idesperiencia;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.url_img_refe = url_img_refe;
        this.enlace_refe = enlace_refe;
        this.persona_id = persona_id;
        this.tipo_empleo_idtipo_empleo = tipo_empleo_idtipo_empleo;
    }*/
}
