package com.demo.openfoodfacts.response; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class OwnerFields{
    public int abbreviated_product_name_fr;
    public int allergens;
    public int brands;
    public int carbohydrates;
    public int categories;
    public int conservation_conditions_fr;
    public int countries;
    public int customer_service_fr;
    public int data_sources;
    @JsonProperty("energy-kcal") 
    public int energyKcal;
    @JsonProperty("energy-kj") 
    public int energyKj;
    public int fat;
    public int fiber;
    public int generic_name_fr;
    public int ingredients_text_fr;
    public int iron;
    public int labels;
    public int lang;
    public int lc;
    public int magnesium;
    public int nutriscore_grade_producer;
    public int nutrition_data_per;
    public int nutrition_data_prepared_per;
    public int obsolete;
    public int packaging;
    public int phosphorus;
    public int preparation_fr;
    public int producer_version_id;
    public int product_name_fr;
    public int proteins;
    public int quantity;
    public int salt;
    @JsonProperty("saturated-fat") 
    public int saturatedFat;
    public int serving_size;
    public int sugars;
    public int traces;
    @JsonProperty("vitamin-b1") 
    public int vitaminB1;
}
