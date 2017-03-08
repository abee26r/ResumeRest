package com.abee.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
public class DataSourceConfig {

	/*@Bean
	public EmbeddedDatabase getDataSource() {

		EmbeddedDatabase database = new EmbeddedDatabaseBuilder()
				.addDefaultScripts().build();
		return database;
	}*/

}
