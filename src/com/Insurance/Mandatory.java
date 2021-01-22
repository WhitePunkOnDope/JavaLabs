package com.Insurance;

public class Mandatory extends Insurance {
    private String license;

    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public Mandatory(){}
    public Mandatory(String name,int sumInsured, int payment, int risk,String license) {
        super(name, sumInsured, payment,risk);
        this.license = license;
    }
}
