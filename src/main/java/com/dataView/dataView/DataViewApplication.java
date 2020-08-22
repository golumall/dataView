package com.dataView.dataView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataViewApplication.class, args);
	}

}
