package com.spartaglobal.alpari.helpers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RatesJsonParser {

    private JSONObject rates;

    public RatesJsonParser(String fileLocation) {
        try{
            RatesFileReader ratesFileReader = new RatesFileReader(fileLocation);
            JSONParser parser = new JSONParser();
            rates = (JSONObject)parser.parse(ratesFileReader.getRatesFile());

        } catch (Exception e){
            e.getStackTrace();
        }
    }

    public JSONObject getRates() {
        return rates;
    }
}

