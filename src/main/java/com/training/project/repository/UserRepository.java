package com.training.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	User findByUsernameAndPassword(String s_firstname, String password);
	
	
	

}
