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
public class Respostas_DadasFacade extends AbstractFacade<Respostas_Dadas> {

    @PersistenceContext(unitName = "ProjetoFinalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Respostas_DadasFacade() {
        super(Respostas_Dadas.class);
    }
    
}
