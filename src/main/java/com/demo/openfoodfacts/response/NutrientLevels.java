package com.demo.openfoodfacts.response; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class NutrientLevels{
    public String fat;
    public String salt;
    @JsonProperty("saturated-fat") 
    public String saturatedFat;
    public String sugars;
}
