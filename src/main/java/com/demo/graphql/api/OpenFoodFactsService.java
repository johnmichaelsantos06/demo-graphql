package com.demo.graphql.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.openfoodfacts.api.OpenFoodFactsClient;
import com.demo.openfoodfacts.response.OpenFoodFactsResponse;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@GraphQLApi
@Service
public class OpenFoodFactsService {
	
	@Autowired
	private OpenFoodFactsClient openFoodFactsClient;
	
	@GraphQLQuery
    public OpenFoodFactsResponse productDetails(String id) {
        return openFoodFactsClient.getProductDetails(id);
    }
}
