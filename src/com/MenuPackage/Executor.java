package com.MenuPackage;

public class Executor  {
     private Command command;
    public void setCommand(Command command)throws Exception{this.command = command;}

    public void action()throws Exception{command.execute();}
}
