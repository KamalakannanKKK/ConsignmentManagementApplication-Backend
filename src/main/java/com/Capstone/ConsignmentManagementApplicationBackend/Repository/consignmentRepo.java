package com.Capstone.ConsignmentManagementApplicationBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Capstone.ConsignmentManagementApplicationBackend.Model.consignment;
@Repository
public interface consignmentRepo  extends JpaRepository<consignment, Integer>{

}
