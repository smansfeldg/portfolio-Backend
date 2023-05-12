package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String ciudad;
    private String profesion;
    private String about;
    private String url_foto;
    
    /*
    @OneToOne(mappedBy = "persona")
    private usuario usuario;
    @OneToMany(mappedBy = "persona")
    private List<educacion> educaciones;
    @OneToMany(mappedBy = "persona")
    private List<experiencia> experiencias;
    @OneToMany(mappedBy = "persona")
    private List<proyectos> proyectos;
    @OneToMany(mappedBy = "persona")
    private List<skills> skills;
 
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
    }*/
}