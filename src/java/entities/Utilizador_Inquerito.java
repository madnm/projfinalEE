package entities;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Utilizador_Inquerito implements Serializable {

    @ManyToOne(targetEntity = Inquerito.class)
    private Inquerito inquerito;

    @ManyToOne(targetEntity = Utilizador.class)
    private Utilizador utilizador;

    @Column(unique=true)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_Utilizador_inquerito;

    public Utilizador_Inquerito() {

    }
   
    public Inquerito getInquerito() {
        return this.inquerito;
    }

    public void setInquerito(Inquerito inquerito) {
        this.inquerito = inquerito;
    }
   
    public Utilizador getUtilizador() {
        return this.utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
   
    public Long getId_Utilizador_inquerito() {
        return this.id_Utilizador_inquerito;
    }

    public void setId_Utilizador_inquerito(Long id_Utilizador_inquerito) {
        this.id_Utilizador_inquerito = id_Utilizador_inquerito;
    }
}