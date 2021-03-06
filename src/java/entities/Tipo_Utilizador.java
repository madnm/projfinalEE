package entities;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipo_Utilizador implements Serializable {

    @Column(unique=true)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_tipo_utilizador;

    @Basic
    private String descricao;

    public Tipo_Utilizador() {

    }
   
    public Long getId_tipo_utilizador() {
        return this.id_tipo_utilizador;
    }

    public void setId_tipo_utilizador(Long id_tipo_utilizador) {
        this.id_tipo_utilizador = id_tipo_utilizador;
    }
   
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return ""+id_tipo_utilizador;
    }
    
    
    
}
