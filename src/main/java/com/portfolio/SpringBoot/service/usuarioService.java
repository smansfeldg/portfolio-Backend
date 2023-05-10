package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.usuario;
import com.portfolio.SpringBoot.repository.usuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService implements IUsuarioService{

    @Autowired
    public usuarioRepository userRepo;
    
    @Override
    public List<usuario> verUsuario() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(usuario user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUsuario(Long idusuario) {
        userRepo.deleteById(idusuario);
    }

    @Override
    public usuario buscarUsuario(Long idusuario) {
        return userRepo.findById(idusuario).orElse(null);
    }
}
