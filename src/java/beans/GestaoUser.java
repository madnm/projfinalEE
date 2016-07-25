/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import entities.Utilizador;
import entities.UtilizadorFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author maris
 */
@SessionScoped
@Named("gestaoUser")
public class GestaoUser implements Serializable{

    @EJB
    private UtilizadorFacade utilizadorFacade;

    private String username;
    private String password;
    private Utilizador user;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilizador getUser() {
        return user;
    }

    public void setUser(Utilizador user) {
        this.user = user;
    }

    public GestaoUser() {
    }

    public String validaUser() {
        user = utilizadorFacade.validaUser(username, password);

       // System.out.println("tipo de utilizador:"+user.getTipo_Utilizador().getDescricao());
        if (user == null) {
            //autenticação falhou
            return "";
        } else {
            
            return "welcome";
        }
    }
    
    public long getTipoUser(){
        return user.getTipo_Utilizador().getId_tipo_utilizador();
    }

}
