/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.EscuelaNuevaV2.service;

import java.util.List;
import java.util.Optional;
import pe.com.EscuelaNuevaV2.entity.DistritoEntity;

/**
 *
 * @author Mauricio
 */
public interface DistritoService {
    List<DistritoEntity> findAll();
    
    List<DistritoEntity> findAllCustom();
    
    Optional<DistritoEntity> FindById(Long id);
    
    DistritoEntity add(DistritoEntity d);
    
    DistritoEntity update(DistritoEntity d);

    DistritoEntity delete(DistritoEntity d);    
}
