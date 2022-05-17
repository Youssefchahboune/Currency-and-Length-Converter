package CurrencyConverterPakage;

import CurrencyConverterPakage.Currency;

import java.util.Hashtable;

public class USD extends Currency {

    private String currencyName = "USD";

    private Hashtable<String,Double> rates;

    public USD(double a){
        super(a);
        rates = new Hashtable<>();
        rates.put("CAD",1.28);
        rates.put("USD",1.0);
        rates.put("YEN",129.79);
        rates.put("EURO",0.95);
    }

    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    @Override
    public double convert(Currency currency) {
        return Math.round((getAmount()*rates.get(currency.getCurrencyName()))*100.0)/100.0;
    }
}