package com.Insurance;
//Інші страхівки
public class AnotherInsurance extends Mandatory {
    public AnotherInsurance(){}
    public AnotherInsurance(String name,int sumInsured, int payment, int risk,String license) {
        super(name, sumInsured, payment,risk,license);
    }
}
