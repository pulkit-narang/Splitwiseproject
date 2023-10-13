package com.scaler.splitwise1.Commands;

import org.springframework.stereotype.Service;

@Service
public interface command {

    //parse and execute commands
    public boolean parse(String commandline);
    public void execute(String commnadline);

        }
