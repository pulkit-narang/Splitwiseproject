package com.scaler.splitwise1.Commands;

import com.scaler.splitwise1.Controllers.UserController;
import com.scaler.splitwise1.dtos.Registeruserresponsedto;
import com.scaler.splitwise1.dtos.registeruserreqdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Resgisterusercommand implements command {

    UserController userController;
    @Autowired
    public Resgisterusercommand(UserController userController)
    {
        this.userController=userController;
    }
    @Override
    public boolean parse(String commandline) {
       List<String> commandtokens= Arrays.stream(commandline.split(" ")).toList();
       if(commandtokens.size()!=4)
       {
           return false;
       }
       if(!commandtokens.get(0).equals(Commandkeywords.Register_User_Command))
       {
           return false;
       }
       return true;
    }
    @Override
    public void execute(String commandline){
        List<String> commandtokens= Arrays.stream(commandline.split(" ")).toList();
        registeruserreqdto reqdto =new registeruserreqdto();
        reqdto.setUsername(commandtokens.get(1));
        reqdto.setPassword(commandtokens.get(2));
        reqdto.setPhnNo(commandtokens.get(3));
        Registeruserresponsedto resdto=userController.registerUser(reqdto);
        System.out.println(resdto);


    }

}
