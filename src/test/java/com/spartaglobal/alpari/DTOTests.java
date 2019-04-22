package com.spartaglobal.alpari;

import com.spartaglobal.alpari.helpers.RatesDTO;
import com.spartaglobal.alpari.helpers.RatesJsonParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class DTOTests {

    private RatesDTO data;

    @Test
    public void isSuccess(){
        data = new RatesDTO("resources/rates.json");
        Assert.assertEquals(data.getSuccess(), true);

    }

    @Test
    public void isTimeStamp(){
        data = new RatesDTO("resources/rates.json");
        Assert.assertEquals(data.getTimeStamp(), 1539182646);
    }

    @Test
    public void isBase(){
        data = new RatesDTO("resources/rates.json");
        Assert.assertEquals(data.getBase(), "EUR");
    }

    @Test
    public void isDate(){
        data = new RatesDTO("resources/rates.json");
        Assert.assertEquals(data.getDate(), "2018-10-10");
    }

    @Test
    public void isRate(){
        data = new RatesDTO("resources/rates.json");
        double bob = data.getRates().get("BOB");
        Assert.assertEquals(bob,7.968929, 0);
    }

    @Test
    public void isRate3(){
        data = new RatesDTO("resources/rates.json");
        ArrayList<Object> rates = data.getRates3();
        Assert.assertTrue(rates.contains(2087.908921) && rates.contains(97.277998));
    }

    @Test
    public void isRate3False(){
        data = new RatesDTO("resources/rates.json");
        ArrayList<Object> rates = data.getRates3();
        Assert.assertFalse(rates.contains(2087.90));
    }
}
