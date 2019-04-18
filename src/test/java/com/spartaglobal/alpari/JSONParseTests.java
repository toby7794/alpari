package com.spartaglobal.alpari;

import com.spartaglobal.alpari.helpers.RatesJsonParser;
import org.junit.Test;

public class JSONParseTests {

    @Test
    public void JSONParseCheck(){
        RatesJsonParser ratesJsonParser = new RatesJsonParser("resources/rates.json");
        ratesJsonParser.printParsedFile();
    }
}
