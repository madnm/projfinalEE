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
public class Respostas_PossiveisFacade extends AbstractFacade<Respostas_Possiveis> {

    @PersistenceContext(unitName = "ProjetoFinalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Respostas_PossiveisFacade() {
        super(Respostas_Possiveis.class);
    }
    
}
