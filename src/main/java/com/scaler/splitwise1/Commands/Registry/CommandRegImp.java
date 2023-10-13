package com.scaler.splitwise1.Commands.Registry;

import com.scaler.splitwise1.Commands.command;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandRegImp implements CommandRegistry{

    List<command> commandList=new ArrayList<>();
    @Override
    public void Registercommand(command Command) {
        commandList.add(Command);

    }

    @Override
    public command getCommand(String Commandline) {
        for (command command:commandList)
        {
            if(command.parse(Commandline))
            {
                return command;
            }

        }
        return null;
    }

    @Override
    public boolean executeCommand(String Commandline) {
        command command=getCommand(Commandline);
        command.execute(Commandline);
        return true;
    }
}
