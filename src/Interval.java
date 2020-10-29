/** Class Interval for calculating odd and even numbers, Fibonacci sequence and percent of odd and even numbers in it */
public class Interval{

    /** Fields consist the start of of interval, end of interval and amount of Fibonacci numbers */
   public int beginOfInter;
    public int endOfInter;
    public int length;

    /** This function print out the odd numbers */
    public void Nepar() {
        System.out.print("Odd numbers: ");
        for (int i = beginOfInter; i < endOfInter; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    /** This function print out the even numbers */
    public void Par(){
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = endOfInter; i > beginOfInter; i--){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

    }
    /** This function calculate the sum of odd numbers */
    public void sumOfNepar(){
        int sum = 0;
        for (int i = beginOfInter; i < endOfInter; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("\nThe sum of odd numbers: " + sum);
    }
    /** Calculate the sum of even numers */
   public void sumOfPar(){
        int sum = 0;
        for (int i = endOfInter; i > beginOfInter; i--){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of even numbers: " + sum);
    }

    /** Method Fiba, that's calculate the Fibonacci sequence
     *and percents of odd and even numbers in sequence */
    public void Fiba(){
        int largestNepar = 0;
        int largestPar = 0;
        /** Creating array for Fibonacci */
        int[] temp = new int[length];
        int percentOfNepar = 0;

        /** Founding the largest odd and even number from sequence */
        if (endOfInter %2 != 0){
            largestNepar = endOfInter;
            largestPar = endOfInter - 1;
        }
        else{
            largestPar = endOfInter;
            largestNepar = endOfInter - 1;

        }
        /** Now this func calculate the Fibonacci sequence and print it out */
        temp [0] = largestNepar;
        temp [1] = largestPar;
        System.out.print("Fibonacci sequence: ");
        System.out.print(temp [0] + " " + temp [1]);
        for(int i = 2; i < length; i++){
            temp [i] = temp [i - 2] + temp [i - 1];
            System.out.print(" " + temp[i]);
        }
        for(int i = 0; i < length; i++){
            if(temp[i] %2 != 0){
                percentOfNepar++;
            }
        }
        /** Here program calculates pecent of odd and even numbers in sequence and thne print them out */
        percentOfNepar = percentOfNepar * 100 / length;
        int percentOfPar = 100 - percentOfNepar;
        System.out.println();
        System.out.println("Percent of odd numbers: " + percentOfNepar);
        System.out.println("Percent of even numbers: " + percentOfPar);
    }


}
