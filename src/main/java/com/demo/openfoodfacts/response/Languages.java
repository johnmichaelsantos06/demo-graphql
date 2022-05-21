package com.demo.openfoodfacts.response; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Languages{
    @JsonProperty("en:english") 
    public int enEnglish;
    @JsonProperty("en:french") 
    public int enFrench;
}
