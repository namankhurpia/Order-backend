package com.namankhurpia.order.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.namankhurpia.order.model.RestoOwner;

@Repository
public interface RestoOwnerRepo extends JpaRepository<RestoOwner, Integer>  {
	
	@Query(value = "SELECT * FROM restoowner r WHERE r.restoid = ?1", nativeQuery = true)
	RestoOwner findOnerestoDetails(int restoid);
	
	@Query(value = "SELECT restoid FROM restoowner r WHERE r.email = ?1", nativeQuery = true)
	String findRestoownerIdFromEmail(String email);
	
	@Query(value = "select COUNT(phoneno) from restoowner r where r.phoneno = ?1", nativeQuery = true)
	int is_valid_phone(String phone);
	
	@Query(value = "select COUNT(email) from restoowner r where r.email = ?1", nativeQuery = true)
	int is_valid_email(String email);

}
