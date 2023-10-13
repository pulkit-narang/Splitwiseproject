package com.scaler.splitwise1.Commands;

import com.scaler.splitwise1.Controllers.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class updateprofilecommand implements command {
    UserController userController;
    @Autowired
    public updateprofilecommand(UserController userController)
    {
        this.userController=userController;
    }
    @Override
    public boolean parse(String commandline) {
        List<String> commandtokens= Arrays.stream(commandline.split(" ")).toList();
        if(commandtokens.size()!=3)
        {
            return false;
        }
        if(!commandtokens.get(0).equals(Commandkeywords.Update_Profile_Command))
        {
            return false;
        }
        return true;
    }

    @Override
    public void execute(String commnadline) {

    }
}
