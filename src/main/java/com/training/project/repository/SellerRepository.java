package com.training.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.model.Seller;


	@Repository
	public interface SellerRepository extends JpaRepository<Seller,Long> {

	
		
	

}
