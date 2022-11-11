/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.EscuelaNuevaV2.controller;

//@RestController -- @Controller +@ResponseBody

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.EscuelaNuevaV2.entity.ParentescoEntity;
import pe.com.EscuelaNuevaV2.service.ParentescoService;

//@RestController aparece en version 4 de Spring
//@RestController --> Indica que es un controlador de tipo REST
@RestController
//@RequestMapping --> Permite definir el nombre del ENDPOINT
@RequestMapping("/parentesco")
public class ParentescoController {
    @Autowired
    private ParentescoService parentescoservice;
    
    //@GetMapping sirve para obtener valores
    @GetMapping
    public List<ParentescoEntity>FindAll(){
        return parentescoservice.findAll();
    }    
        @GetMapping("/custom")
    public List<ParentescoEntity> findAllCustom(){
    return parentescoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ParentescoEntity> findById(@PathVariable Long id){
    return parentescoservice.FindById(id);
    }
    @PostMapping
    public ParentescoEntity add(@RequestBody ParentescoEntity p){
     return parentescoservice.add(p);
    }
    @PutMapping("/{id}")
       public ParentescoEntity update(@PathVariable long id,@RequestBody ParentescoEntity p){
       p.setCodigo(id);
       return parentescoservice.update(p);
       }
    @DeleteMapping("/{id}")
    public ParentescoEntity delete(@PathVariable long id){
        ParentescoEntity objcategoria = new ParentescoEntity();
    objcategoria.setEstado(false);
    return parentescoservice.delete(ParentescoEntity.builder().codigo(id).build());}    
}
