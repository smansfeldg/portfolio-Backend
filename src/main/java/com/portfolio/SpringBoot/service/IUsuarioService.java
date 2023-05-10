package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<usuario> verUsuario();
    public void crearUsuario (usuario user);
    public void borrarUsuario (Long idusuario);
    public usuario buscarUsuario (Long idusuario);
}
