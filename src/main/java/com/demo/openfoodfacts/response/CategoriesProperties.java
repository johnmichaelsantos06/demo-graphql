package com.demo.openfoodfacts.response; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class CategoriesProperties{
    @JsonProperty("agribalyse_food_code:en") 
    public String agribalyseFoodCodeEn;
    @JsonProperty("agribalyse_proxy_food_code:en") 
    public String agribalyseProxyFoodCodeEn;
    @JsonProperty("ciqual_food_code:en") 
    public String ciqualFoodCodeEn;
}
