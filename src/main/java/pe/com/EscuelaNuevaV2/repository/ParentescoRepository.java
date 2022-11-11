/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.EscuelaNuevaV2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.EscuelaNuevaV2.entity.ParentescoEntity;

/**
 *
 * @author Mauricio
 */
public interface ParentescoRepository extends JpaRepository<ParentescoEntity, Long>{
        @Query("select p from ParentescoEntity p where p.estado=1") 
    List<ParentescoEntity> findAllCustom();
}
