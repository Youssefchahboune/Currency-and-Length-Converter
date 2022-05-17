package com.example.c_l_flash_converter;

import java.util.Hashtable;

public class CAD extends Currency{

    private String currencyName = "CAD";

    private Hashtable<String,Double> rates;

    public CAD(double a){
        super(a);
        rates  = new Hashtable<>();
        rates.put("CAD",1.0);
        rates.put("USD",0.78);
        rates.put("YEN",101.1);
        rates.put("EURO",0.74);
    }

    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    @Override
    public double convert(Currency currency) {
        return getAmount()*rates.get(currency.getCurrencyName());
    }
}