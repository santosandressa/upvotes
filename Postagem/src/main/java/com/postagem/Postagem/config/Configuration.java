package com.postagem.Postagem.config;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.postagem.Postagem.util.Initialize;

@org.springframework.context.annotation.Configuration
@Profile("teste")
public class Configuration {

	@Autowired
	private Initialize initialize;

	@Value("${spring.jpa.hibernate.ddl-auto")
	private String strategy;

	@Bean
	public boolean InstantiateDataBase() throws ParseException {
		if (!"create".equals(strategy)) {
			initialize.instantiateDatabase();
		}
		return true;
	}
}