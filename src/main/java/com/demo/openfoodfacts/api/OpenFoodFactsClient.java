package com.demo.openfoodfacts.api;

import com.demo.openfoodfacts.response.OpenFoodFactsResponse;

public interface OpenFoodFactsClient {
	OpenFoodFactsResponse getProductDetails(String id);
}
