package com.MenuPackage;

public class RangeOfValueCommand implements Command {
    com.MenuPackage.mainMenu mainMenu;

    public RangeOfValueCommand(com.MenuPackage.mainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void execute() {
        mainMenu.RangeOfValue();
    }
}
