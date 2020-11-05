/**@author Oleg Kuranov */
package com.company;

import com.company.Car;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of cars: ");
        int size = in.nextInt();
        Car[] car = new Car[size];
        ScanCar(car,in);
        for (Car value : car){
            System.out.println(value.toString());
        }
        PrintCarModelInfo(car, in);
        PrintCarYearInfo(car, in);
        PrintCarPriceInfo(car, in);
    }


    static void ScanCar(Car[] car, Scanner in) {
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
            System.out.println("");
            System.out.print("Enter id of car: ");
            car[i].setId(in.nextInt());
            System.out.print("Enter model of car: ");
            car[i].setModel(in.next());
            System.out.print("Enter price of car: ");
            car[i].setPrice(in.nextInt());
            System.out.print("Enter register number of car: ");
            car[i].setRegistrationNumber(in.next());
            System.out.print("Enter manufacture date of car: ");
            car[i].setYearOfProduction(in.nextInt());
        }
    }






    static void PrintCarModelInfo(Car[] car, Scanner in){
        System.out.print("Enter car model about which you wanna get info: ");
        in.nextLine();
        String mod = in.nextLine();
        for (Car value : car) {
            if (value.getModel().equals(mod)) {
                System.out.println(value.toString());
            }
        }
    }




    static void PrintCarYearInfo(Car[] car, Scanner in){
        System.out.print("Enter car model: ");
        String mod = in.nextLine();
        System.out.print("Enter amount of years that car has been used: ");
        int year = in.nextInt();
        for (Car value : car){
            if(value.getModel().equals(mod) && (2020 - value.getYearOfProduction()) > year){
                System.out.println(value.toString());
            }
        }
    }


    static void PrintCarPriceInfo(Car[] car, Scanner in){
        System.out.print("Enter manufacture date of car: ");
        int year = in.nextInt();
        System.out.print("Enter car price: ");
        int price = in.nextInt();
        for (Car value : car){
            if (value.getYearOfProduction() == year && value.getPrice() > price){
                System.out.println(value.toString());
            }
        }
    }
}