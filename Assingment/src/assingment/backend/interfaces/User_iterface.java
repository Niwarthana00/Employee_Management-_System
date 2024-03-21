/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package assingment.backend.interfaces;

import assingment.backend.model.User;

public interface User_iterface {
        boolean createUser(User user_ob);
        void deleteUser(String email);
        String loginFunction(String email, String password);
        String password_generate();
        void download_password(String password , String name);
}
