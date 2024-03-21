/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.model;

/**
 *
 * @author MSI
 */
public class HR_Assistant extends User{ 
     private String name;
     private String address;
     private String designation;
     private String nic;
     private String bod;
     private int working_experince;
     private String education_qualification;
     private String email;
     
    public HR_Assistant(String name, String address, String designation, String nic, String bod, int working_experince, String education_qualification, int id, String email, String password, String userType, String telephoneNumber, String timestamp) {
        super(id, email, password, userType, telephoneNumber, timestamp);
        this.name = name;
        this.address = address;
        this.designation = designation;
        this.nic = nic;
        this.bod = bod;
        this.working_experince = working_experince;
        this.education_qualification = education_qualification;
        this.email = email;
    }

    public HR_Assistant(String name, String address, String designation, String nic, String bod, int working_experince, String education_qualification , String email) {
        this.name = name;
        this.address = address;
        this.designation = designation;
        this.nic = nic;
        this.bod = bod;
        this.working_experince = working_experince;
        this.education_qualification = education_qualification;
        this.email = email;
    }

 
    public HR_Assistant() {
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public int getWorking_experince() {
        return working_experince;
    }

    public void setWorking_experince(int working_experince) {
        this.working_experince = working_experince;
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

    public void updateSet(String name_txt, String address_txt, String designation_txt, int working_experince, String education_qualification_txt, String passv) {
        this.name = name_txt;
        this.address = address_txt;
        this.designation = designation_txt;
        this.working_experince = working_experince;
        this.education_qualification = education_qualification_txt;
       
    }
     
    
     
}
