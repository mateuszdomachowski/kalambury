package com.mateuszdomachowski.kalambury.Service.implementation;

import com.mateuszdomachowski.kalambury.Data.Passwords;
import com.mateuszdomachowski.kalambury.Service.PasswordsService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PasswordsServiceImplementation implements PasswordsService {

    Passwords passwords = new Passwords();
    Random random = new Random();

    public String readLevelPassword(String level){
        switch (level){
            case "Easy":
                return passwords.getEasyPasswordsList().get(random.nextInt(passwords.getEasyPasswordsList().size()));
            case "Medium":
                return passwords.getMediumPasswordsList().get(random.nextInt(passwords.getMediumPasswordsList().size()));
            case "Hard":
                return passwords.getHardPasswordsList().get(random.nextInt(passwords.getHardPasswordsList().size()));
        }
        return level;
    }
    public void addPassword(String level, String password){
        switch (level){
            case "Easy":
                if (!passwords.getEasyPasswordsList().contains(password)){
                    passwords.getEasyPasswordsList().add(password);
                }else {
                    System.out.println("Hasło " + password + " znajduję się już na liście haseł");
                }
            case "Medium":
                if (!passwords.getMediumPasswordsList().contains(password)){
                    passwords.getMediumPasswordsList().add(password);
                }else {
                    System.out.println("Hasło " + password + " znajduję się już na liście haseł");
                }
            case "Hard":
                if (!passwords.getHardPasswordsList().contains(password)){
                    passwords.getHardPasswordsList().add(password);
                }else {
                    System.out.println("Hasło " + password + " znajduję się już na liście haseł");
                }
        }
    }
    public void deletePassword(String level, String password){
        switch (level){
            case "Easy":
                passwords.getEasyPasswordsList().remove(password);
            case "Medium":
                passwords.getMediumPasswordsList().remove(password);
            case "Hard":
                passwords.getHardPasswordsList().remove(password);

        }

    }
    public void editPassword(String level, String oldPassword, String newPassword){


    }
}
