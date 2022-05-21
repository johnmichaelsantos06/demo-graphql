package com.demo.openfoodfacts.response; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class CategoryProperties{
    @JsonProperty("ciqual_food_name:en") 
    public String ciqualFoodNameEn;
    @JsonProperty("ciqual_food_name:fr") 
    public String ciqualFoodNameFr;
}
