package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.persona;
import com.portfolio.SpringBoot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    //List<persona> listaPersona = new ArrayList();
    
   /* 
    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "Hola mundo " + nombre;
    }
    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre,
                             @RequestParam String apellido){
        return "Chau mundo " + nombre + " " + apellido;
    }
    */
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody persona pers){
        persoServ.crearPersona(pers);
        //listaPersona.add(pers);
    }
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<persona> verPersona(){
        return persoServ.verPersona();
        //return listaPersona;
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPerosna(id);
    }
}