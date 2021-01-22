package com.MenuPackage;

public class CalculateTheCostCommand implements Command {
    com.MenuPackage.mainMenu mainMenu;

    public CalculateTheCostCommand(com.MenuPackage.mainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void execute() {
        mainMenu.CalculateTheCost();
    }
}
