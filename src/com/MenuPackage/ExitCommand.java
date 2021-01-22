package com.MenuPackage;

public class ExitCommand implements Command {

        com.MenuPackage.mainMenu mainMenu;

    public ExitCommand(com.MenuPackage.mainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void execute() {
        mainMenu.Exit();
    }
}





