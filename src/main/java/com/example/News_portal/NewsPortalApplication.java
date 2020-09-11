package com.example.News_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class NewsPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsPortalApplication.class, args);
	}

}
