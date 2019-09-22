package model;

import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name ="transaction")

public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	

	private long id;

	private String name;
	private String sourcepassport;
	private String destinationpassport;
	private String destinationbank;
	private String destinationcountry;
	private String accountnumber;
	private Float amount;
	private int transactioncode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcepassport() {
		return sourcepassport;
	}
	public void setSourcepassport(String sourcepassport) {
		this.sourcepassport = sourcepassport;
	}
	public String getDestinationpassport() {
		return destinationpassport;
	}
	public void setDestinationpassport(String destinationpassport) {
		this.destinationpassport = destinationpassport;
	}
	public String getDestinationbank() {
		return destinationbank;
	}
	public void setDestinationbank(String destinationbank) {
		this.destinationbank = destinationbank;
	}
	public String getDestinationcountry() {
		return destinationcountry;
	}
	public void setDestinationcountry(String destinationcountry) {
		this.destinationcountry = destinationcountry;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public int getTransactioncode() {
		final AtomicInteger count = new AtomicInteger(0); 
		transactioncode= count.incrementAndGet();
		return transactioncode;
	}
	public void setTransactioncode(int transactioncode) {
		this.transactioncode = transactioncode;
	}
	
	
}
