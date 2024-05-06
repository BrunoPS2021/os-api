package com.bruno.pereira.silva.os.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bruno.pereira.silva.os.services.DBService;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddl;
	
	@PostConstruct
    public boolean instanciaDB() {
		
		//if(ddl.equals("create")) {
			this.dbService.instaciaDB();
		//}
		
		return false;
	}
}
