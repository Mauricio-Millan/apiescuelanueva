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
import pe.com.EscuelaNuevaV2.entity.ApoderadoEntity;
import pe.com.EscuelaNuevaV2.service.ApoderadoService;

//@RestController aparece en version 4 de Spring
//@RestController --> Indica que es un controlador de tipo REST
@RestController
//@RequestMapping --> Permite definir el nombre del ENDPOINT
@RequestMapping("/apoderado")
public class ApoderadoController {
    @Autowired
    private ApoderadoService apoderadoservice;
    
    //@GetMapping sirve para obtener valores
    @GetMapping
    public List<ApoderadoEntity>FindAll(){
        return apoderadoservice.findAll();
    }    
        @GetMapping("/custom")
    public List<ApoderadoEntity> findAllCustom(){
    return apoderadoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ApoderadoEntity> findById(@PathVariable Long id){
    return apoderadoservice.FindById(id);
    }
    @PostMapping
    public ApoderadoEntity add(@RequestBody ApoderadoEntity a){
     return apoderadoservice.add(a);
    }
    @PutMapping("/{id}")
       public ApoderadoEntity update(@PathVariable long id,@RequestBody ApoderadoEntity a){
       a.setCodigo(id);
       return apoderadoservice.update(a);
       }
    @DeleteMapping("/{id}")
    public ApoderadoEntity delete(@PathVariable long id){
    ApoderadoEntity objapoderado = new ApoderadoEntity();
    objapoderado.setEstado(false);
    return apoderadoservice.delete(ApoderadoEntity.builder().codigo(id).build());}    
}
