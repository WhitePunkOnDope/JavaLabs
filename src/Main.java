/**@author Oleg Kuranov */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Interval interval = new Interval();
        System.out.println("Enter the begin of interval: ");
        interval.beginOfInter = scanner.nextInt();
        System.out.println("Enter the end of interval: ");
        interval.endOfInter = scanner.nextInt();
        interval.Nepar();
        interval.Par();
        interval.sumOfNepar();
        interval.sumOfPar();
        System.out.println("Enter the amount of fibonacci numbers: ");
        interval.length = scanner.nextInt();
        interval.Fiba();
    }
}






