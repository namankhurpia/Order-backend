package com.namankhurpia.order.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.namankhurpia.order.model.txn.Renew;

@Repository
public interface RenewRepo extends JpaRepository<Renew, Integer> {

}
