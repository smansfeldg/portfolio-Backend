package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.educacion;
import com.portfolio.SpringBoot.model.experiencia;
import com.portfolio.SpringBoot.model.persona;
import com.portfolio.SpringBoot.model.proyectos;
import com.portfolio.SpringBoot.model.skills;
import com.portfolio.SpringBoot.model.tipo_empleo;
import com.portfolio.SpringBoot.model.tipo_skill;
import com.portfolio.SpringBoot.model.usuario;
import com.portfolio.SpringBoot.service.IEducacionService;
import com.portfolio.SpringBoot.service.IExperienciaService;
import com.portfolio.SpringBoot.service.IPersonaService;
import com.portfolio.SpringBoot.service.IProyectosService;
import com.portfolio.SpringBoot.service.ITipo_empleoService;
import com.portfolio.SpringBoot.service.IUsuarioService;
import com.portfolio.SpringBoot.service.iSkillService;
import com.portfolio.SpringBoot.service.iTipo_skillService;
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
    ///PERSONA
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<persona> verPersona(){
        return persoServ.verPersona();
    }
    @GetMapping("/ver/persona/{id}")
    @ResponseBody
    public persona buscarPersona(@PathVariable Long id) {
//        System.out.println("id que resive de portman: ");
//        System.out.println(id);
        return persoServ.buscarPersona(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPerosna(id);
    }
    ///USUARIO
    @Autowired
    private IUsuarioService userServ;
    
    @PostMapping ("/new/usuario")
    public void agregarUsuario(@RequestBody usuario user){
        userServ.crearUsuario(user);
    }
    
    @GetMapping ("/ver/usuario")
    @ResponseBody
    public List<usuario> verUsuario(){
        return userServ.verUsuario();
    }
    
    @DeleteMapping("/deleteUser/{id}")
    public void borrarUsuario(@PathVariable Long id){
        userServ.borrarUsuario(id);
    }
    ///EDUCACION
    @Autowired
    private IEducacionService educServ;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion(@RequestBody educacion educ){
        educServ.crearEducacion(educ);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<educacion> verEducacion(){
        return educServ.verEducacion();
    }
    
    @DeleteMapping("/deleteEducacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    ///EXPERIENCIA
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia(@RequestBody experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<experiencia> verExperiencia(){
        return expServ.verExperiencia();
    }
    
    @DeleteMapping("/deleteExperiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    ///TIPO_EMPLEO
    @Autowired
    private ITipo_empleoService empServ;
    
    @PostMapping ("/new/tipo_empleo")
    public void agregarTipo_empleo(@RequestBody tipo_empleo empl){
        empServ.crearTipo_empleo(empl);
    }
    
    @GetMapping ("/ver/tipo_empleo")
    @ResponseBody
    public List<tipo_empleo> verTipo_empleo(){
        return empServ.verTipo_empleo();
    }
    
    @DeleteMapping("/deleteTipo_empleo/{id}")
    public void borrarTipo_empleo(@PathVariable Long id){
        empServ.borrarTipo_empleo(id);
    }
    ///PROYECTOS
    @Autowired
    private IProyectosService proyServ;
    
    @PostMapping ("/new/proyectos")
    public void agregarProyectos(@RequestBody proyectos proyec){
        proyServ.crearProyectos(proyec);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<proyectos> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @DeleteMapping("/deleteProyectos/{id}")
    public void borrarProyectos(@PathVariable Long id){
        proyServ.borrarProyectos(id);
    }
    ///TIPO_SKILL
    @Autowired
    private iTipo_skillService tskillServ;
    
    @PostMapping ("/new/tipo_skill")
    public void agregarTipo_skill(@RequestBody tipo_skill tskill){
        tskillServ.crearTipo_skill(tskill);
    }
    
    @GetMapping ("/ver/tipo_skill")
    @ResponseBody
    public List<tipo_skill> verTipo_skill(){
        return tskillServ.verTipo_skill();
    }
    
    @DeleteMapping("/deleteTipo_skill/{id}")
    public void borrarTipo_skill(@PathVariable Long id){
        tskillServ.borrarTipo_skill(id);
    }
    ///SKILL
    @Autowired
    private iSkillService skillServ;
    
    @PostMapping ("/new/skill")
    public void agregarSkills(@RequestBody skills skill){
        skillServ.crearSkills(skill);
    }
    
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<skills> verSkills(){
        return skillServ.verSkills();
    }
    
    @DeleteMapping("/deleteSkill/{id}")
    public void borrarSkills(@PathVariable Long idskills){
        skillServ.borrarSkills(idskills);
    }
}
