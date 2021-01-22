package com.MenuPackage;

public class ShowMainCommand implements Command{
    com.MenuPackage.mainMenu mainMenu;
    public ShowMainCommand(com.MenuPackage.mainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void execute() {
        mainMenu.showMain();
    }

}
