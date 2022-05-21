package com.demo.openfoodfacts.response; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class SourcesFields{
    @JsonProperty("org-gs1") 
    public OrgGs1 orgGs1;
}
