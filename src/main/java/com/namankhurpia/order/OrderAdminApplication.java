package com.namankhurpia.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.namankhurpia"})
public class OrderAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderAdminApplication.class, args);
	}

}
