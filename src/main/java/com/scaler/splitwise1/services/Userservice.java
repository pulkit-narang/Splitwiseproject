package com.scaler.splitwise1.services;

import com.scaler.splitwise1.Repository.UserRepository;
import com.scaler.splitwise1.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    UserRepository userrepo;
    @Autowired
    public Userservice (UserRepository userrepo)
    {
        this.userrepo=userrepo;
    }

    public User registerservice(String name, String password, String phnNo)
    {
        User user=new User();
        user.setUserName(name);
        user.setHashedpassword(password);
        user.setPhnNumber(phnNo);
        User user1=userrepo.save(user);
        return user1;

    }
}
