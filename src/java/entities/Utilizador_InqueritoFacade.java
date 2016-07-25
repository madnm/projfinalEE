/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author maris
 */
@Stateless
public class Utilizador_InqueritoFacade extends AbstractFacade<Utilizador_Inquerito> {

    @PersistenceContext(unitName = "ProjetoFinalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Utilizador_InqueritoFacade() {
        super(Utilizador_Inquerito.class);
    }
    
}
