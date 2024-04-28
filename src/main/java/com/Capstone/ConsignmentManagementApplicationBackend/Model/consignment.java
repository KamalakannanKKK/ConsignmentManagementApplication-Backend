package com.Capstone.ConsignmentManagementApplicationBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class consignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int consignmentId;
	private String consignmentCategory;
	private String delieveryPartner;
	private String consignmentStatus;
	public int getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(int consignmentId) {
		this.consignmentId = consignmentId;
	}
	public String getConsignmentCategory() {
		return consignmentCategory;
	}
	public void setConsignmentCategory(String consignmentCategory) {
		this.consignmentCategory = consignmentCategory;
	}
	public String getDelieveryPartner() {
		return delieveryPartner;
	}
	public void setDelieveryPartner(String delieveryPartner) {
		this.delieveryPartner = delieveryPartner;
	}
	public String getConsignmentStatus() {
		return consignmentStatus;
	}
	public void setConsignmentStatus(String consignmentStatus) {
		this.consignmentStatus = consignmentStatus;
	}
	public consignment(int consignmentId, String consignmentCategory, String delieveryPartner,
			String consignmentStatus) {
		super();
		this.consignmentId = consignmentId;
		this.consignmentCategory = consignmentCategory;
		this.delieveryPartner = delieveryPartner;
		this.consignmentStatus = consignmentStatus;
	}
	public consignment() {
		super();
	}
	
	
}
