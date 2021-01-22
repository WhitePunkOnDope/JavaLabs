import com.MenuPackage.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        int choice;
        Scanner in = new Scanner(System.in);
        mainMenu mainMenu = new mainMenu();
        Executor executor = new Executor();
        Command command;
        while (true) {
            command = new ShowMainCommand(mainMenu);
            executor.setCommand(command);
            executor.action();
            System.out.println("Choose action from menu:");
            choice = in.nextInt();
            switch(choice) {

                case 1:
                    command =  new ReadFromFileCommand(mainMenu);
                    executor.setCommand(command);
                    executor.action();
                    command = new PrintListCommand(mainMenu);
                break;
                case 2:
                    command = new AddDataCommand(mainMenu);
                    break;
                case 3:
                    command = new CalculateTheCostCommand(mainMenu);
                    break;
                case 4:
                    command = new SortCommand(mainMenu);
                    break;
                case 5:
                    command = new RangeOfValueCommand(mainMenu);
                    break;
                case 6:
                    command =  new SortAnotherInsuranceCommand(mainMenu);
                    break;
                case 7:
                    command = new ExitCommand(mainMenu);
                break;
                default:
                    System.out.println("Data entry error...");
            }
            executor.setCommand(command);
            executor.action();
            if(choice == 7) break;
        }
    }
}


