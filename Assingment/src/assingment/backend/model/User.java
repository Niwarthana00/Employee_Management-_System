/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package assingment.backend.model;

public class User {
    private int id;
    private String email;
    private String password;
    private String userType;
    private String telephoneNumber;
    private String timestamp;
    
    //overload contructor
    public User(int id, String email, String password, String userType, String telephoneNumber, String timestamp) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.telephoneNumber = telephoneNumber;
        this.timestamp = timestamp;
    }

    //contructor
    User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
