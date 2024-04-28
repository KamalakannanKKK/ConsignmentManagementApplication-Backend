package com.Capstone.ConsignmentManagementApplicationBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Capstone.ConsignmentManagementApplicationBackend.Model.consignment;
import com.Capstone.ConsignmentManagementApplicationBackend.Repository.consignmentRepo;

@Service
public class consignmentService {

	@Autowired
	private consignmentRepo consignmentRepo;

	public List<consignment> getAllConsignment() {
		return this.consignmentRepo.findAll();
	}

	public consignment getconsignmentById(int id) {
		return this.consignmentRepo.findById(id).get();
	}
	
	public consignment addConsignment(consignment consignment) {
		return this.consignmentRepo.save(consignment);
	}
	
	public consignment updateConsignment(consignment consignment,int id) {
		consignment Consignment=this.consignmentRepo.findById(id).get();
		Consignment.setConsignmentStatus(consignment.getConsignmentStatus());
		Consignment.setConsignmentCategory(consignment.getConsignmentCategory());
		Consignment.setDelieveryPartner(consignment.getDelieveryPartner());
		return this.consignmentRepo.save(Consignment);
	}
	
	public void deleteConsignment(int id) {
		this.consignmentRepo.deleteById(id);
	}
}
