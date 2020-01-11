package com.fx.rates.quoteservice;

import java.util.HashMap;

public enum ECurrency {


    EUR("EUR"),
    RON("RON"),
    GBP("GBP"),
    USD("USD");
    //todo add eur, ron, gbp, usd
    //add label property
    //add constructor with label property as parameter

    String label;

    ECurrency(String label){
        this.label = label;
    }

    public static ECurrency getByLabel(String toUpperCase) {
        for (ECurrency e: ECurrency.values()) {
            if (e.label.equals(toUpperCase)){
                return e;
            }
        }
        return null;
    }

    private static final HashMap<String, ECurrency> MAP = new HashMap<String, ECurrency>();

    static {
        for (ECurrency currency : ECurrency.values()) {
            MAP.put(currency.getLabel(), currency);
        }
    }
    
    public static ECurrency getByLabelM(String label) {
        return MAP.get(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
