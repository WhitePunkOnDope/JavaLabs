package com.Insurance;

public  class Insurance implements Comparable<Insurance> {
    private String name;
    private int sumInsured;  //виплата
    private int payment; //платіж
    private int risk;

    public Insurance(){}
    @Override
    public int compareTo(Insurance o) {
        if (this.risk > o.risk)
            return 1;
        else return -1;
    }
    @Override
    public String toString() {
        return "name = " + name + '\'' +
                ", sumInsured = " + sumInsured +
                ", payment = " + payment +
                ", risk = " + risk +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(int sumInsured) {
        this.sumInsured = sumInsured;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public Insurance(String name, int sumInsured, int payment, int risk) {
        this.name = name;
        this.sumInsured = sumInsured;
        this.payment = payment;
        this.risk = risk;
    }
}
