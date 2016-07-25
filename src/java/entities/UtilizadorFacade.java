/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author maris
 */
@Stateless
public class UtilizadorFacade extends AbstractFacade<Utilizador> {

    @PersistenceContext(unitName = "ProjetoFinalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilizadorFacade() {
        super(Utilizador.class);
    }
    
    public Utilizador validaUser(String username, String password){
        
        Query query = em.createQuery("select u from Utilizador u where u.username = :username and u.password= :password");
        
        query.setParameter("username", username);
        query.setParameter("password", password);
        
        List result = query.getResultList();
        
        if(result.isEmpty()){
            return null;
        }
        else{
            return (Utilizador)result.get(0);
        }

    }
    
}
