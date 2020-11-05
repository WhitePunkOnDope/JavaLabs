package com.company;

public class Car {
    private int id, yearOfProduction, price;
    private String model, registrationNumber;

    public void setId(int ID){ id = ID; }
    public void setModel(String MODEL){ model = MODEL; }
    public void setYearOfProduction(int YEAR){ yearOfProduction = YEAR; }
    public void setPrice(int PRICE){ price = PRICE; }
    public void setRegistrationNumber(String REG_NUM) { registrationNumber = REG_NUM; }

    public int getId(){ return id; }
    public String getModel(){ return model; }
    public int getYearOfProduction(){ return yearOfProduction; }
    public int getPrice(){ return price; }
    public String getRegistrationNumber(){ return registrationNumber; }

    public String toString(){
        return "-----------" + "\nID: " + this.id + "\nModel: " + this.model + "\nRegister number: "+ registrationNumber +
                "\nYear: " + this.yearOfProduction + "\nPrice: " + this.price;
    }




}