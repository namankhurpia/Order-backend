package com.namankhurpia.order.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.namankhurpia.order.model.txn.Menu;

@Repository
public interface MenuRepo  extends JpaRepository<Menu, Integer>  {
	
	@Query(value = "SELECT * FROM menudetails m WHERE m.dishbelongresto = ?1", nativeQuery = true)
	List<Menu> findRestrauntMenuItemfromRestoID (int restoid);
	
	@Query(value ="SELECT DISTINCT dishcuisine FROM menudetails m WHERE m.dishbelongresto = ?1",nativeQuery = true)
	List<String> GetAllCuisinebyRestoId (int restoid);
	
	@Query(value = "SELECT * FROM menudetails m WHERE m.dishbelongresto = ?1 and m.dishcuisine = ?2", nativeQuery = true)
	List<Menu> GetMenuItemsbyRestoIdAndCuisine (int restoid, String dishcuisine);

}
