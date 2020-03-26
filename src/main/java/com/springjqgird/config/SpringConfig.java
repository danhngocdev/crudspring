package com.springjqgird.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	      
    @Bean(name = "dataSource")
    public DataSource mySqlDataSource() 
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/SPRINGJQGIRD");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("123456");
	        return dataSourceBuilder.build();
	    }
}
