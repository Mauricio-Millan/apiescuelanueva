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
import pe.com.EscuelaNuevaV2.entity.ApoderadoEntity;
import pe.com.EscuelaNuevaV2.repository.ApoderadoRepository;

@Service
public class ApoderadoServiceImpl implements ApoderadoService{
    @Autowired
    private ApoderadoRepository apoderadorepository;
    
    @Override
    public List<ApoderadoEntity> findAll() {
        return apoderadorepository.findAll();
    }
    @Override
    public List<ApoderadoEntity> findAllCustom() {
        return apoderadorepository.findAllCustom();
    }
    @Override
    public Optional<ApoderadoEntity> FindById(Long id) {
        return apoderadorepository.findById(id);
    }

    @Override
    public ApoderadoEntity add(ApoderadoEntity a) {
        return apoderadorepository.save(a);
    }
    @Override
    public ApoderadoEntity update(ApoderadoEntity a) {
        ApoderadoEntity objapoderado=apoderadorepository.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objapoderado);
        return apoderadorepository.save(objapoderado);      
    }
    @Override
    public ApoderadoEntity delete(ApoderadoEntity a) {
        ApoderadoEntity objapoderado=apoderadorepository.getById(a.getCodigo());
        objapoderado.setEstado(false);
        return apoderadorepository.save(objapoderado);    
    }    
}
