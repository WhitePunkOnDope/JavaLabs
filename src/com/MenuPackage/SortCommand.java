package com.MenuPackage;

public class SortCommand implements Command {
    com.MenuPackage.mainMenu mainMenu;
    public SortCommand(com.MenuPackage.mainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void execute() {
        mainMenu.Sort();
    }
}
