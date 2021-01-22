package com.MenuPackage;

public class AddDataCommand implements Command {
    com.MenuPackage.mainMenu mainMenu;

    public AddDataCommand(com.MenuPackage.mainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void execute() {
        mainMenu.AddData();
    }
}
