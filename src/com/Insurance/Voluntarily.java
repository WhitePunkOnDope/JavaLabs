package com.Insurance;

public class Voluntarily extends Insurance {
    private String term;

    public String getTerm() {
        return term;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public Voluntarily(){}
    public Voluntarily(String name,int sumInsured, int payment, int risk,String term) {
        super(name, sumInsured, payment,risk);
        this.term = term;
    }
}
