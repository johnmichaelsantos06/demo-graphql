package com.demo.openfoodfacts.api.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.openfoodfacts.api.OpenFoodFactsClient;
import com.demo.openfoodfacts.response.OpenFoodFactsResponse;

@Service
public class OpenFoodFactsClientImpl implements OpenFoodFactsClient {

	private static final String BASE_URL = "https://world.openfoodfacts.org/api/v0";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public OpenFoodFactsResponse getProductDetails(Long id) {
		String url = BASE_URL + "/product/{id}";
		
		Map<String, String> urlParams = new HashMap<>();
		urlParams.put("id", String.valueOf(id));

		ResponseEntity<OpenFoodFactsResponse> response = restTemplate.exchange(url, HttpMethod.GET, null, OpenFoodFactsResponse.class, urlParams);

		return response.getBody();
	}

}
