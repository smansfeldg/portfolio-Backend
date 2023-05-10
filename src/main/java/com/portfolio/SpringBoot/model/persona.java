package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String ciudad;
    private String profesion;
    private String about;
    private String url_foto;
    
    public persona(){}
    
    public persona(Long id, String nombre, String apellido, String ciudad,
    String profesion, String about, String url_foto){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.profesion = profesion;
        this.about = about;
        this.url_foto = url_foto;
    }
}