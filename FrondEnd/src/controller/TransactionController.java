package controller;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Model.Transaction;
import service.TransactionEJB;

@ManagedBean(name ="transactioncontroller")
@SessionScoped
public class TransactionController {
	
	@EJB
	TransactionEJB transactionservice;
	
	@ManagedProperty(value ="#{transaction}")
	private Transaction transaction;
	
	public void addnewTransaction()
	{
		transactionservice.addNew(transaction.getEntity());
		
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
}
