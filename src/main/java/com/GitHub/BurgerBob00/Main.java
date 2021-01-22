package com.GitHub.BurgerBob00;

import com.GitHub.BurgerBob00.Listener.MessageListener;
import com.GitHub.BurgerBob00.Listener.StartListener;
import com.google.gson.Gson;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws LoginException {
        /*File cf = new File("./config.json");
        Gson gson;
        if(!cf.exists()){
            try {
                cf.createNewFile();
                System.out.println("Bitte Config Datei einstellen");
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
          String json = cf.toString();
        }*/
        JDA jda = JDABuilder.createDefault("ODAxMDk4MTMyNTI3Nzc1NzY0.YAbuxg.TAIQR4z1_8jXYSHhqn8Rjm_2eZ8").build();
        jda.addEventListener(new StartListener());
        jda.addEventListener(new MessageListener());
    }
}
