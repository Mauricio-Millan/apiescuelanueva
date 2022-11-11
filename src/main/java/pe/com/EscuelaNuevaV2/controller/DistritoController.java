/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.EscuelaNuevaV2.controller;
//@Controller  --> Indica que un controlador de tipo Spring
//ResponseBody --> Cuando se agrega esta notación se vuelve Rest

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
import pe.com.EscuelaNuevaV2.entity.DistritoEntity;
import pe.com.EscuelaNuevaV2.service.DistritoService;



//@RestController -- @Controller +@ResponseBody
//@RestController aparece en version 4 de Spring
//@RestController --> Indica que es un controlador de tipo REST
@RestController
//@RequestMapping --> Permite definir el nombre del ENDPOINT
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoservice;
    
    //@GetMapping sirve para obtener valores
    @GetMapping
    public List<DistritoEntity>FindAll(){
        return distritoservice.findAll();
    }    
        @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
    return distritoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
    return distritoservice.FindById(id);
    }
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d){
     return distritoservice.add(d);
    }
    @PutMapping("/{id}")
       public DistritoEntity update(@PathVariable long id,@RequestBody DistritoEntity d){
       d.setCodigo(id);
       return distritoservice.update(d);
       }
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable long id){
    DistritoEntity objcategoria = new DistritoEntity();
    objcategoria.setEstado(false);
    return distritoservice.delete(DistritoEntity.builder().codigo(id).build());}
}
