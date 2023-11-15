package com.mateuszdomachowski.kalambury.Service;

import org.springframework.stereotype.Service;

public interface PasswordsService {

    String readLevelPassword(String level);
    void addPassword(String level, String password);
    void deletePassword(String level, String password);
    void editPassword(String level, String oldPassword, String newPassword);

}
