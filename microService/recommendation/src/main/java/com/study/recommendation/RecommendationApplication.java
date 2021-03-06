package com.study.recommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.study")
public class RecommendationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommendationApplication.class, args);
	}

}
