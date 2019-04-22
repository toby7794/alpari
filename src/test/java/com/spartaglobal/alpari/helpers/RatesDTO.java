package com.spartaglobal.alpari.helpers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class RatesDTO {

    private JSONObject fullRatesJSON;

    public RatesDTO(String fileLocation) {
        fullRatesJSON = new RatesJsonParser(fileLocation).getRates();
    }

    public boolean getSuccess(){
        return (boolean) fullRatesJSON.get("success");
    }

    public long getTimeStamp(){
        return (long) fullRatesJSON.get("timestamp");
    }

    public String getBase(){
        return (String) fullRatesJSON.get("base");
    }

    public String getDate(){
        return (String) fullRatesJSON.get("date");
    }

    public HashMap<String, Double> getRates(){
        HashMap<String, Double> rates = (HashMap<String, Double>) fullRatesJSON.get("rates");
        return rates;
    }

    public String getRates2(){
        String rateString = "";
        JSONObject rates = (JSONObject) fullRatesJSON.get("rates");
        ArrayList<String> rate = new ArrayList<>();

        for (Object keyStr : rates.keySet()){
            String key = (String) keyStr;
            Object value = rates.get(key);
            rate.add("\"" + key + "\"" + ":" + value + ",");
        }
        Object [] array = rate.toArray();
        Arrays.sort(array);
        for (int i=0; i < rate.size(); i++)
            rateString = rateString + "\n" + array[i];
    return rateString;
    }

    public ArrayList<Object> getRates3() {
        JSONObject rate = (JSONObject) fullRatesJSON.get("rates");
        ArrayList<Object> rates = new ArrayList<>();

        for (Object keyStr : rate.keySet()) {
            String key = (String) keyStr;
            Object value = rate.get(key);
            rates.add(value);
        }
        return rates;
    }

}
