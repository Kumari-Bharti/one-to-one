package com.example.one.to.one.unidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="passport_details")

public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long passportId;
	private String passdetails;
	private String addressType;
	public Passport(Long passportId, String passdetails, String addressType) {
		super();
		this.passportId = passportId;
		this.passdetails = passdetails;
		this.addressType = addressType;
	}
	public Long getPassportId() {
		return passportId;
	}
	public void setPassportId(Long passportId) {
		this.passportId = passportId;
	}
	public String getPassdetails() {
		return passdetails;
	}
	public void setPassdetails(String passdetails) {
		this.passdetails = passdetails;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passdetails=" + passdetails + ", addressType=" + addressType
				+ "]";
	}
	
	
	
	
	
	
}

