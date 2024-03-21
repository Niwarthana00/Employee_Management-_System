/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.model;

/**
 *
 * @author MSI
 */
public class HR_Manager extends User {
     private String name;
     private String address;
     private String nic;
     private String bod;
     private String education_qualification;
     private String email;
             
    public HR_Manager(String name, String address, String nic, String bod, String education_qualification, int id, String email, String password, String userType, String telephoneNumber, String timestamp) {
        super(id, email, password, userType, telephoneNumber, timestamp);
        this.name = name;
        this.address = address;
        this.nic = nic;
        this.bod = bod;
        this.education_qualification = education_qualification;
        this.email = email;
    }

    public HR_Manager(String name, String address, String nic, String bod, String education_qualification, String email) {
        this.name = name;
        this.address = address;
        this.nic = nic;
        this.bod = bod;
        this.education_qualification = education_qualification;
        this.email = email;
    }

    public HR_Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    public String getEducation_qualification() {
        return education_qualification;
    }

    public void setEducation_qualification(String education_qualification) {
        this.education_qualification = education_qualification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateSet(String name_txt, String add_txt,  String eq_txt, String passv) {
        this.name = name_txt;
        this.address = add_txt;
        this.education_qualification = eq_txt;
        setPassword(passv);
    }
     
     

}
