package entities;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inquerito implements Serializable {

    @Basic
    private Date data_inicio;

    @Basic
    private Date data_fim;

    @Basic
    private Date data_criacao;

    @Basic
    private Time hora_inicio;

    @Column(unique=true)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_inquerito;

    @ManyToOne(targetEntity = Utilizador.class)
    private Utilizador utilizador;

    @Basic
    private String titulo;

    @Basic
    private Time hora_fim;

    public Inquerito() {

    }
   
    public Date getData_inicio() {
        return this.data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }
   
    public Date getData_fim() {
        return this.data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }
   
    public Date getData_criacao() {
        return this.data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }
   
    public Time getHora_inicio() {
        return this.hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }
   
    public Long getId_inquerito() {
        return this.id_inquerito;
    }

    public void setId_inquerito(Long id_inquerito) {
        this.id_inquerito = id_inquerito;
    }
   
    public Utilizador getUtilizador() {
        return this.utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
   
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
    public Time getHora_fim() {
        return this.hora_fim;
    }

    public void setHora_fim(Time hora_fim) {
        this.hora_fim = hora_fim;
    }
}
