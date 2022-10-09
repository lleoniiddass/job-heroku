package com.academicquestjob.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean
	RestOperations rest(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.basicAuthentication("academicquest", "ricardosilvagostadexbox").build();
	}

	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    
//	@Bean
//	public RestTemplate getRestTemplate(@Value("${security.oauth2.client.client-id}") String bearerToken) {
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getInterceptors().add((request, body, clientHttpRequestExecution) -> {
//			HttpHeaders headers = request.getHeaders();
//
//			if (!headers.containsKey("Authorization")) {
//				String token = bearerToken.toLowerCase().startsWith("bearer") ? bearerToken : "Bearer " + bearerToken;
//				request.getHeaders().add("Authorization", token);
//			}
//			return clientHttpRequestExecution.execute(request, body);
//		});
//
//		return restTemplate;
//	}
	
}
