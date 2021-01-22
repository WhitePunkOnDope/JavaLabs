package com.MenuPackage;

public class SortAnotherInsuranceCommand implements Command {
    com.MenuPackage.mainMenu mainMenu;
    public SortAnotherInsuranceCommand(com.MenuPackage.mainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void execute() {
        mainMenu.SortAnotherInsurance();
    }
}
