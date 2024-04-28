package com.Capstone.ConsignmentManagementApplicationBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Capstone.ConsignmentManagementApplicationBackend.Model.consignment;
import com.Capstone.ConsignmentManagementApplicationBackend.Service.consignmentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class consignmentController {

	@Autowired
	private consignmentService consignmentService;
	
	@GetMapping("/getAllConsignment")
	public List<consignment> getAllConsignment() {
		return this.consignmentService.getAllConsignment();
	}
	
	@GetMapping("/getConsignment/{id}")
	public consignment getConsignmentById(@PathVariable int id) {
		return this.consignmentService.getconsignmentById(id);
	}
	
	@PostMapping("/saveConsignment")
	public consignment addConsignment(@RequestBody consignment Consignment) {
		return this.consignmentService.addConsignment(Consignment);
	}
	
	@PutMapping("updateConsignment/{id}")
	public consignment updateConsignment(@RequestBody consignment Consignment,@PathVariable int id) {
		return this.consignmentService.updateConsignment(Consignment, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteConsignment(@PathVariable int id) {
		this.consignmentService.deleteConsignment(id);
	}
}
