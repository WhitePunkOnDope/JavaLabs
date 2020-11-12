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
        CarArray(car);
        for (Car value : car){
            System.out.println(value.toString());
        }
        CarModelInfo(car, in);
        CarYearInfo(car, in);
        CarPriceInfo(car, in);
        in.close();
    }

/**
 *  Here user can input info about cars,
 *  but that doing another method instead of us in this case
 */

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

    /**
     * This method create random information
     * about cars instead of user to save time
     */
    static void CarArray(Car[] car) {
        Random random = new Random();
        String[] mas = {"Fabia", "Octavia", "LS400", "Silvia S15", "Mark 2", "RS 7", "Q8", "A1", "Huracan",
                "Golf", "Cybertruck", "M5 F90", "X5M", "Codiaq"};
        String[] reg = {"KA", "АА", "BC", "AI", "ВP", "CA", "TA", "АН", "OA"};
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
            car[i].setId(random.nextInt(8999) + 1000);
            car[i].setModel(mas[random.nextInt(mas.length)]);
            car[i].setPrice(random.nextInt(50000) + 5000);
            car[i].setRegistrationNumber(reg[random.nextInt(reg.length)] + random.nextInt((8999)+ 1000) + reg[random.nextInt(reg.length)]);
            car[i].setYearOfProduction(random.nextInt(30) + 1990);
        }
    }


    /**
     * In this method user enter model of car about which
     * he wont to get info and also method output it
     */
    static void CarModelInfo(Car[] car, Scanner in){
        System.out.print("Enter car model which about you wanna get info: ");
        in.nextLine();
        String mod = in.nextLine();
        for (Car value : car) {
            if (value.getModel().equals(mod)) {
                System.out.println(value.toString());
            }
        }
    }


    /**
     * Here user input car model and amount of years that car has been used,
     * so he can get info about car, if there are some coincidences
     */
    static void CarYearInfo(Car[] car, Scanner in){
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

    /**
     * Now user input manufacture date of car and price, 
     * so if there are cars with entered year and bigger price it gonna find them and print out
     */
    static void CarPriceInfo(Car[] car, Scanner in){
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