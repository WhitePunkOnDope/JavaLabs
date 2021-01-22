package com.MenuPackage;

public class PrintListCommand implements Command {
    com.MenuPackage.mainMenu mainMenu;
    public PrintListCommand(com.MenuPackage.mainMenu mainMenu)throws Exception {
        this.mainMenu = mainMenu;
    }


    @Override
    public void execute(){
        mainMenu.PrintList();

    }

}
