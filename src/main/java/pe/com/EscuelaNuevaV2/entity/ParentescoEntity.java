/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.EscuelaNuevaV2.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ParentescoEntity")
@Table(name="parentesco")
public class ParentescoEntity implements Serializable {
    private static final long serialVersionUID=1L;    
    //Atributo
    @Id
    @Column(name="codpar")
    private long codigo;
    @Column(name="despar")    
    private String descripcion;
    @Column(name="estpar")    
    private boolean estado;
    //metodo cosntructor sin aprametros
    
}
