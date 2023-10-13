package com.scaler.splitwise1;

import com.scaler.splitwise1.Commands.Registry.CommandRegImp;
import com.scaler.splitwise1.Commands.Registry.CommandRegistry;
import com.scaler.splitwise1.Commands.Resgisterusercommand;
import com.scaler.splitwise1.Commands.updateprofilecommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Splitwise1Application implements CommandLineRunner {
    @Autowired
    CommandRegistry commandRegistry;
   @Autowired
   Resgisterusercommand registerusercommand;

    @Autowired
    updateprofilecommand updateprofilecommand;
    public static void main(String[] args) {
        SpringApplication.run(Splitwise1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        commandRegistry.Registercommand(registerusercommand);
        commandRegistry.Registercommand(updateprofilecommand);
        while(true)
          {
              String input ="Register avb ahjjk jkj";
                  commandRegistry.executeCommand(input);
          }
    }
}
