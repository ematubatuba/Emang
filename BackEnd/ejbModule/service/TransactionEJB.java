package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TransactionEntity;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {

 @PersistenceContext
 private EntityManager em;
 
    public TransactionEJB() {
        // TODO Auto-generated constructor stub
    	
    }
    
    public void addNew(TransactionEntity transactionentity)
	{
		
    	em.persist(transactionentity);
	}

}
