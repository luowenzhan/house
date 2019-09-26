package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
	private static String[] originsVal = new String[] { 
			"127.0.0.1:8080", 
			"localhost:8080", 
			"127.0.0.1:8888",
			"localhost:8888", 
			"127.0.0.1:8020",
			"localhost:8020", 
			};

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		this.addAllowedOrigins(corsConfiguration);
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.setAllowCredentials(true); // 跨域session共享
		source.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(source);
	}

	private void addAllowedOrigins(CorsConfiguration corsConfiguration) {
		for (String origin : originsVal) {
			corsConfiguration.addAllowedOrigin("http://" + origin);
			corsConfiguration.addAllowedOrigin("https://" + origin);
		}
	}
}
