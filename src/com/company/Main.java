package com.company;

import Droid.*;
import Fight.Battle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.Scanner;

public class Main {
    static List<Droid> droids = new ArrayList();

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        createdDroids();
        while(selectAction());
    }

    private static boolean selectAction() throws IOException {
        System.out.println("1 - create fighter");
        System.out.println("2 - show list of created fighters");
        System.out.println("3 - fight 1 VS 1");
        System.out.println("4 - start team battle");
        System.out.println("5 - exit the program");

        System.out.print("Select action: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(bufferedReader.readLine());
        switch (index) {
            case 1:
                addDroid();
                break;
            case 2:
                printDroids();
                break;
            case 3:
                battle1x1();
                break;
            case 4:
                teamBattle();
                break;
            case 5:
                return false;
            default:
                System.out.println("Invalid data");
        }
        return true;
    }

    private static void createdDroids() {
        Random rand = new Random();
        Droid droid1 = new Warrior("Sniper", rand.nextInt(80) + 30, rand.nextInt(15) + 3, 15);
        Droid droid2 = new Warrior("Warrior", rand.nextInt(80) + 30, rand.nextInt(15) + 3, 15);
        Droid droidHealer1 = new Shaman("Witch Doctor", rand.nextInt(80) + 30, rand.nextInt(10)+3, rand.nextInt(6)+1);
        Droid droid4 = new Warrior("Enigma", rand.nextInt(80) + 30, rand.nextInt(15) + 3, 15);
        Droid droid5 = new Warrior("Ursa", rand.nextInt(80) + 30, rand.nextInt(15) + 3, 15);
        Droid droidHealer2 = new Shaman("Lion", rand.nextInt(80) + 30, rand.nextInt(15)+3, rand.nextInt(6)+1);
        Droid droid7 = new Warrior("Owl", rand.nextInt(80) + 30, rand.nextInt(15) + 3, 15);
        Droid droidHealer3 = new Shaman("Shaman", rand.nextInt(80) + 30, rand.nextInt(15)+3, rand.nextInt(6)+1);
        droids.add(droid1);
        droids.add(droid2);
        droids.add(droidHealer1);
        droids.add(droid4);
        droids.add(droid5);
        droids.add(droidHealer2);
        droids.add(droid7);
        droids.add(droidHealer3);
    }
    public static void addDroid() {
        Scanner in = new Scanner(System.in);
        String name;
        int hp;
        System.out.print("Enter name of fighter: ");
        name = in.nextLine();
        System.out.print("Enter fighter amount of health: ");
        hp = in.nextInt();
        System.out.print("Enter damage: ");
        int damage = in.nextInt();
        System.out.print("Enter class of fighter(1 - warrior, 2 - shaman): ");
        int type = in.nextInt();
        switch (type) {
            case 1:
                System.out.print("Enter chance of block: ");
                int blockChance = in.nextInt();
                droids.add(new Warrior(name, hp, damage, blockChance));
                break;
            case 2:
                System.out.print("Enter amount of healing points: ");
                int plusNumber = in.nextInt();
                droids.add(new Shaman(name, hp, damage, plusNumber));
                break;
            default:
                System.out.println("Enter 1 or 2");
        }
    }
    public static void printDroids(){
        for (int i = 0; i <droids.size() ; i++) {
            System.out.println((i+1)+". "+droids.get(i));
        }
    }
    public static void battle1x1(){
        Scanner scanner=new Scanner(System.in);
        List<Droid> droid1=new ArrayList();
        List<Droid> droid2=new ArrayList();
        System.out.println("Choose first fighter:");
        printDroids();
        droid1.add(droids.get(scanner.nextInt()-1));
        System.out.println("Choose second fighter:");
        printDroids();
        droid2.add(droids.get(scanner.nextInt()-1));
        Battle oneXone = new Battle(droid1, droid2);
        oneXone.teamBattle();
    }
    public static void teamBattle(){
        Scanner scanner=new Scanner(System.in);
        List<Droid> droid1=new ArrayList();
        List<Droid> droid2=new ArrayList();
        int id;
        System.out.println("Choose fighters for first team (0 - end of entering): ");
        printDroids();
        while (true){
            id=scanner.nextInt();
            if(id>0)
                droid1.add(droids.get(id-1));
            else
                break;
        }
        System.out.println("Choose fighters for second team (0 - end of entering): ");
        printDroids();
        while (true){

            id=scanner.nextInt();
            if(id>0)
                droid2.add(droids.get(id-1));
            else
                break;
        }
        Battle battleofteams = new Battle(droid1, droid2);
        battleofteams.teamBattle();
    }
}

