/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.EscuelaNuevaV2.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.EscuelaNuevaV2.entity.DistritoEntity;
import pe.com.EscuelaNuevaV2.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{
   @Autowired
    private DistritoRepository distritorepository;

    @Override
    public List<DistritoEntity> findAll() {
        return distritorepository.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return distritorepository.findAllCustom();
    }

    @Override
    public Optional<DistritoEntity> FindById(Long id) {
        return distritorepository.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return distritorepository.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objdistrito=distritorepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return distritorepository.save(objdistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity objdistrito=distritorepository.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return distritorepository.save(objdistrito);
    }    
}
