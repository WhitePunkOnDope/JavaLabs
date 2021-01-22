package com.MenuPackage;

import java.lang.*;

public class ReadFromFileCommand implements Command {
    com.MenuPackage.mainMenu mainMenu;
    public ReadFromFileCommand(com.MenuPackage.mainMenu mainMenu)throws Exception {
        this.mainMenu = mainMenu;
    }


        @Override
        public void execute(){
       mainMenu.ReadFromFile();

        }

}
