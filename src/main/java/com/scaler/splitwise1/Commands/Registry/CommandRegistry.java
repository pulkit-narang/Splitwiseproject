package com.scaler.splitwise1.Commands.Registry;


import com.scaler.splitwise1.Commands.command;

public interface CommandRegistry {

    public  void Registercommand(command Command);
    public  command getCommand(String Commandline);

    boolean executeCommand(String Commandline);
}
