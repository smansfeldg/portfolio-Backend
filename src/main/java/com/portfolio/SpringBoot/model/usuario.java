package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;
    
    private String user_name;
    private String password;
    private Long persona_id;
    
    public usuario(){}
    
    public usuario(Long idusuario, String user_name, String password, Long persona_id){
        this.idusuario = idusuario;
        this.user_name = user_name;
        this.password = password;
        this.persona_id = persona_id;
    }
}
