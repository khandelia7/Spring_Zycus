package com.demo;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import com.demo.service.BankService;

//@PropertySource("classpath:db.properties")
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(BankApplication.class);
		BankService bankService = context.getBean(BankService.class);
		bankService.transfer(1L, 2L, 2000);
	}

}