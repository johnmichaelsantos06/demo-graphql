package com.demo.graphql.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.demo.model.OpenFoodFactsModel;
import com.demo.openfoodfacts.api.OpenFoodFactsClient;
import com.demo.openfoodfacts.response.OpenFoodFactsResponse;

import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLNonNull;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@GraphQLApi
@Service
@Validated
public class OpenFoodFactsService {
	
	@Autowired
	private OpenFoodFactsClient openFoodFactsClient;
	
	@GraphQLQuery
    public OpenFoodFactsResponse productDetails(@GraphQLNonNull String id) {
        return openFoodFactsClient.getProductDetails(id);
    }
	
	// example usage of mutation only but in reality the method here should be saving to a data store
	@GraphQLMutation
    public OpenFoodFactsResponse createProduct(@GraphQLNonNull OpenFoodFactsModel model) {
		return openFoodFactsClient.getProductDetails(model.getCode());
    }
}
