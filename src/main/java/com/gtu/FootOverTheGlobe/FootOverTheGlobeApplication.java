package com.gtu.FootOverTheGlobe;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FootOverTheGlobeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootOverTheGlobeApplication.class, args);
	}

	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){
    return hemf.getSessionFactory();  
	}
}