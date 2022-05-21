package com.demo.openfoodfacts.response; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Nutriments{
    @JsonProperty("beta-glucan") 
    public double betaGlucan;
    @JsonProperty("beta-glucan_100g") 
    public double betaGlucan100g;
    @JsonProperty("beta-glucan_label") 
    public String betaGlucanLabel;
    @JsonProperty("beta-glucan_serving") 
    public double betaGlucanServing;
    @JsonProperty("beta-glucan_unit") 
    public String betaGlucanUnit;
    @JsonProperty("beta-glucan_value") 
    public double betaGlucanValue;
    public int carbohydrates;
    public int carbohydrates_100g;
    public int carbohydrates_serving;
    public String carbohydrates_unit;
    public int carbohydrates_value;
    @JsonProperty("carbon-footprint-from-known-ingredients_100g") 
    public int carbonFootprintFromKnownIngredients100g;
    @JsonProperty("carbon-footprint-from-known-ingredients_product") 
    public int carbonFootprintFromKnownIngredientsProduct;
    @JsonProperty("carbon-footprint-from-known-ingredients_serving") 
    public int carbonFootprintFromKnownIngredientsServing;
    public int energy;
    @JsonProperty("energy-kcal") 
    public int energyKcal;
    @JsonProperty("energy-kcal_100g") 
    public int energyKcal100g;
    @JsonProperty("energy-kcal_serving") 
    public int energyKcalServing;
    @JsonProperty("energy-kcal_unit") 
    public String energyKcalUnit;
    @JsonProperty("energy-kcal_value") 
    public int energyKcalValue;
    @JsonProperty("energy-kj") 
    public int energyKj;
    @JsonProperty("energy-kj_100g") 
    public int energyKj100g;
    @JsonProperty("energy-kj_serving") 
    public int energyKjServing;
    @JsonProperty("energy-kj_unit") 
    public String energyKjUnit;
    @JsonProperty("energy-kj_value") 
    public int energyKjValue;
    public int energy_100g;
    public int energy_serving;
    public String energy_unit;
    public int energy_value;
    public int fat;
    public int fat_100g;
    public double fat_serving;
    public String fat_unit;
    public int fat_value;
    public int fiber;
    public int fiber_100g;
    public double fiber_serving;
    public String fiber_unit;
    public int fiber_value;
    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g") 
    public int fruitsVegetablesNutsEstimateFromIngredients100g;
    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_serving") 
    public int fruitsVegetablesNutsEstimateFromIngredientsServing;
    public double iron;
    public double iron_100g;
    public String iron_label;
    public double iron_serving;
    public String iron_unit;
    public double iron_value;
    public double magnesium;
    public double magnesium_100g;
    public String magnesium_label;
    public double magnesium_serving;
    public String magnesium_unit;
    public int magnesium_value;
    @JsonProperty("nova-group") 
    public int novaGroup;
    @JsonProperty("nova-group_100g") 
    public int novaGroup100g;
    @JsonProperty("nova-group_serving") 
    public int novaGroupServing;
    @JsonProperty("nutrition-score-fr") 
    public int nutritionScoreFr;
    @JsonProperty("nutrition-score-fr_100g") 
    public int nutritionScoreFr100g;
    public double phosphorus;
    public double phosphorus_100g;
    public String phosphorus_label;
    public double phosphorus_serving;
    public String phosphorus_unit;
    public int phosphorus_value;
    public int proteins;
    public int proteins_100g;
    public double proteins_serving;
    public String proteins_unit;
    public int proteins_value;
    public double salt;
    public double salt_100g;
    public double salt_serving;
    public String salt_unit;
    public double salt_value;
    @JsonProperty("saturated-fat") 
    public double saturatedFat;
    @JsonProperty("saturated-fat_100g") 
    public double saturatedFat100g;
    @JsonProperty("saturated-fat_serving") 
    public double saturatedFatServing;
    @JsonProperty("saturated-fat_unit") 
    public String saturatedFatUnit;
    @JsonProperty("saturated-fat_value") 
    public double saturatedFatValue;
    public double sodium;
    public double sodium_100g;
    public double sodium_serving;
    public String sodium_unit;
    public double sodium_value;
    public double sugars;
    public double sugars_100g;
    public double sugars_serving;
    public String sugars_unit;
    public double sugars_value;
    @JsonProperty("vitamin-b1") 
    public double vitaminB1;
    @JsonProperty("vitamin-b1_100g") 
    public double vitaminB1100g;
    @JsonProperty("vitamin-b1_label") 
    public String vitaminB1Label;
    @JsonProperty("vitamin-b1_serving") 
    public double vitaminB1Serving;
    @JsonProperty("vitamin-b1_unit") 
    public String vitaminB1Unit;
    @JsonProperty("vitamin-b1_value") 
    public double vitaminB1Value;
}
