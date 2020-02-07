package com.pankaj.metilica.metallicatradeservice.comtroller;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Counterparty {
	
	private String counterPartyId;
	private String  counterPartyName;
	public String getCounterPartyId() {
		return counterPartyId;
	}
	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}
	public String getCounterPartyName() {
		return counterPartyName;
	}
	public void setCounterPartyName(String counterPartyName) {
		this.counterPartyName = counterPartyName;
	}
	public Counterparty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Counterparty(String counterPartyId, String counterPartyName) {
		super();
		this.counterPartyId = counterPartyId;
		this.counterPartyName = counterPartyName;
	}
	

}
