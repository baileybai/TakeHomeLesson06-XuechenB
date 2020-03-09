package com.example.springtakehomeassignment06_xuechenb;

import java.io.Serializable;

public class DetailInformation implements Serializable {
    private Integer amount;
    private Integer taxPercentage;
    private Integer tipPercentage;

    public DetailInformation(Integer amount, Integer taxPercentage, Integer tipPercentage) {
        this.amount = amount;
        this.taxPercentage = taxPercentage;
        this.tipPercentage = tipPercentage;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Integer taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Integer getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(Integer tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    @Override
    public String toString() {
        return "Total: " + amount +
                "\n:Sales Tax " + taxPercentage * 100 +
                "\n Tip" + tipPercentage * 100 +
                "\nGrand Total: " + amount + amount * taxPercentage + amount * tipPercentage;
    }
}
