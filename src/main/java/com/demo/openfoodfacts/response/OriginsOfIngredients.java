package com.demo.openfoodfacts.response; 
import java.util.ArrayList; 
public class OriginsOfIngredients{
    public ArrayList<AggregatedOrigin> aggregated_origins;
    public int epi_score;
    public int epi_value;
    public ArrayList<String> origins_from_origins_field;
    public TransportationScores transportation_scores;
    public TransportationValues transportation_values;
    public Values values;
    public String warning;
}
