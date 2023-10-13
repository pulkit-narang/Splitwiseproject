package com.scaler.splitwise1.Controllers;

import com.scaler.splitwise1.dtos.Registeruserresponsedto;
import com.scaler.splitwise1.dtos.registeruserreqdto;
import com.scaler.splitwise1.models.User;
import com.scaler.splitwise1.services.Userservice;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private Userservice userservice;

     @Autowired
    public UserController(Userservice userservice)
    {
        this.userservice=userservice;
    }
    public Registeruserresponsedto registerUser(registeruserreqdto userdto)
    {
           User user=userservice.registerservice(userdto.getUsername(),
                   userdto.getPassword(),userdto.getPhnNo());

     Registeruserresponsedto response=new Registeruserresponsedto();
        response.setUser(user);
        return response;

    }

}
