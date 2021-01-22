package com.MenuPackage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import com.Insurance.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;


public class mainMenu {
private ArrayList<Voluntarily> derivative = new ArrayList<>();
private ArrayList<Mandatory> anotherInsurance = new ArrayList<>();

    void showMain()
    {
        System.out.println("           Main menu              ");
        System.out.println("                                 ");
        System.out.println("---------------------------------");
        System.out.println(" 1. Read data from file");
        System.out.println(" 2. Add data to file");
        System.out.println(" 3. Сalculate the cost");
        System.out.println(" 4. Sorting derivatives based on\n    reducing the level of risk");
        System.out.println(" 5. Derivative in range of value ");
        System.out.println(" 6. Another insurance in range of value");
        System.out.println(" 7. Exit");
        System.out.println("---------------------------------\n");
    }
    void Exit()
    {
        System.out.println("Program is closed...");
    }
    void RangeOfValue()
    {
        if(derivative.isEmpty()){
            ReadFromFile();
        }
        int lim1, lim2, choice;
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------\n");
        System.out.println("1.Range of risk");
        System.out.println("2.Range of sum insured");
        System.out.println("3.Range of payment");
        System.out.println("---------------------------\n");
        choice = in.nextInt();
        System.out.println("Enter first value and second value(first value < second value)");
        lim1 = in.nextInt();
        lim2 = in.nextInt();
       switch(choice){
           case 1:
               Risk(lim1, lim2);
               break;
           case 2:
               SumInsured(lim1, lim2);
               break;
           case 3:
               Payment(lim1, lim2);
               break;
               default:
                   System.out.println("Error"); break;
       }
    }
    public void Payment(int lim1,int lim2){
        for(int i = 0;i<derivative.size();i++)
        {
            if(derivative.get(i).getPayment()<lim2 && derivative.get(i).getPayment()>lim1)
                System.out.println(derivative.get(i));
        }
    }
    public void SumInsured(int lim1,int lim2){
        for(int i = 0;i<derivative.size();i++)
        {
            if(derivative.get(i).getSumInsured()<lim2 && derivative.get(i).getSumInsured()>lim1)
                System.out.println(derivative.get(i));
        }
    }
    public void Risk(int lim1,double lim2){
        for(int i = 0;i<derivative.size();i++)
        {
            if(derivative.get(i).getRisk()<lim2 && derivative.get(i).getRisk()>lim1)
                System.out.println(derivative.get(i));
        }
    }
    void CalculateTheCost()
    {
        int sum = 0;
        int sum1 = 0;
        if(derivative.isEmpty()) {
            ReadFromFile();
        }
        for(Voluntarily element : derivative){
            sum+= element.getSumInsured();
            sum1+=element.getPayment();
        }
        System.out.println("Calculating for derivative:");
        System.out.println("Sum of insured is " +sum);
        System.out.println("Sum payment is " +sum1);
        for(Mandatory element : anotherInsurance){
            sum+= element.getSumInsured();
            sum1+=element.getPayment();
        }
        System.out.println("Calculating for another insurance:");
        System.out.println("Sum of insured is " +sum);
        System.out.println("Sum payment is " +sum1);
    }
    void AddData()
    {
        String file  = "D:\\PP_lab4-8\\Страхові зобов'язання.txt";
        String name, term, payment, sumInsured, risk;
        Scanner in = new Scanner(System.in);
        try{
        BufferedWriter br = new BufferedWriter(new FileWriter(file,true));
            System.out.print("Enter name:");
            name =in.nextLine();
            System.out.print("Enter payment:");
            payment =in.nextLine();
            System.out.print("Enter sum insured:");
            sumInsured =in.nextLine();
            System.out.print("Enter term or license:");
            term =in.nextLine();
            System.out.print("Enter risk:");
            risk =in.nextLine();
            br.write(name+"\n");br.write(payment+"\n");
            br.write(sumInsured+"\n");br.write(term+"\n");
            br.write(risk+"\n");
        br.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void Sort()
    {
        if(derivative.isEmpty()) {
            ReadFromFile();
        }
        Collections.sort(derivative);
        System.out.println("Name"+"\t\t"+"Payment"+"\t\t"+"Sum of Insured"+"\t\t"+"Risk"+"\t\t"+"Term");
       for(Voluntarily element : derivative){
           System.out.println(element.getName()+"\t\t"+element.getPayment()+"\t\t"
           +element.getSumInsured()+"\t\t\t\t"+element.getRisk()+"\t\t"+element.getTerm());
       }
    }

    void SortAnotherInsurance()
    {
        if(derivative.isEmpty()){
            ReadFromFile();
        }
        int lim1, lim2, choice;
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------\n");
        System.out.println("1.Range of risk");
        System.out.println("2.Range of sum insured");
        System.out.println("3.Range of payment");
        System.out.println("---------------------------\n");
        choice = in.nextInt();
        System.out.println("Enter first value and second value(first value < second value)");
        lim1 = in.nextInt();
        lim2 = in.nextInt();
        switch(choice){
            case 1:
                Risk2(lim1, lim2);
                break;
            case 2:
                SumInsured2(lim1, lim2);
                break;
            case 3:
                Payment2(lim1, lim2);
                break;
            default:
                System.out.println("Error"); break;
        }
    }
    public void Payment2(int lim1,int lim2){
        for(int i = 0;i<anotherInsurance.size();i++)
        {
            if(anotherInsurance.get(i).getPayment()<lim2 && anotherInsurance.get(i).getPayment()>lim1)
                System.out.println(anotherInsurance.get(i));
        }
    }
    public void SumInsured2(int lim1,int lim2){
        for(int i = 0;i<anotherInsurance.size();i++)
        {
            if(anotherInsurance.get(i).getSumInsured()<lim2 && anotherInsurance.get(i).getSumInsured()>lim1)
                System.out.println(anotherInsurance.get(i));
        }
    }
    public void Risk2(int lim1,double lim2){
        for(int i = 0;i<anotherInsurance.size();i++)
        {
            if(anotherInsurance.get(i).getRisk()<lim2 && anotherInsurance.get(i).getRisk()>lim1)
                System.out.println(anotherInsurance.get(i));
        }
    }

 public void ReadFromFile(){
     System.out.println("Reading data from file...");
     derivative.clear();
     anotherInsurance.clear();
        try {
            FileReader reader = new FileReader(
                    "D:\\PP_lab4-8\\Страхові зобов'язання.txt");
            BufferedReader bf = new BufferedReader(reader);
            String name, term;
            int risk, sumInsured, payment;
            String line;
            while(( line =  bf.readLine())!= null) {
                name =line;
                line = bf.readLine();
                payment = Integer.parseInt(line);
                line = bf.readLine();
                sumInsured = Integer.parseInt(line);
                line = bf.readLine();
                term = line;
                line = bf.readLine();
                risk = Integer.parseInt(line);
                if(name.equals("Форвард")||name.equals("СВОП")||
                        name.equals("Ф'ючерс")||
                        name.equals("Опціон")||
                        name.equals("Варант")){
                    Derivative list = new Derivative(name,sumInsured,payment,risk,term);
                    derivative.add(list);
                }
                else{
                    AnotherInsurance data = new AnotherInsurance(name,sumInsured,payment, risk, term);
                    anotherInsurance.add(data);
                }
            }
            bf.close();
        }catch (Exception e){
            System.out.println(e);
        }
 }
 public void PrintList()
 {
     System.out.println("Name"+"\t\t"+"Payment"+"\t\t"+"Sum of Insured"+"\t\t"+"Risk"+"\t\t"+"Term");
     for(Voluntarily element : derivative){
         System.out.println(element.getName()+"\t\t"+element.getPayment()+"\t\t"
                 +element.getSumInsured()+"\t\t\t\t"+element.getRisk()+"\t\t"+element.getTerm());
     }
     System.out.println("Name"+"\t\t\t\t\t\t"+"Payment"+"\t\t\t\t"+"Sum of Insured"+"\t\t\t"+"Risk"+"\t\t"+"License");
     for(Mandatory element : anotherInsurance){

         System.out.println(element.getName()+"\t\t"+element.getPayment()+"\t\t\t\t"
                 +element.getSumInsured()+"\t\t\t\t\t"+element.getRisk()+"\t\t\t"+element.getLicense());
     }
 }
}
