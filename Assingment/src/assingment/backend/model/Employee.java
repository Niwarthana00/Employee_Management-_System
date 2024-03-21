/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.model;

public class Employee {
    private int id;
    private String epf_num;
    private String name;
    private String department;
    private String designation;
    private String bod;
    private String phoneNumber;
    private String email;
    private String salary;
    private String employmentStatus;
    private String qualifications;
    private String experience; 
    private String nic;

    public Employee(int id, String epf_num, String name, String department, String designation, String bod, String phoneNumber, String email, String salary, String employmentStatus, String qualifications, String experience , String nic) {
        this.id = id;
        this.epf_num = epf_num;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.bod = bod;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.employmentStatus = employmentStatus;
        this.qualifications = qualifications;
        this.experience = experience;
        this.nic = nic;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEpf_num() {
        return epf_num;
    }

    public void setEpf_num(String epf_num) {
        this.epf_num = epf_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void searchFun(String name, String epf_num, String designation, String department) {
        this.epf_num = epf_num;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public void updateEmp(String name , String designation, String department, String salary, String qualifications, String experience) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.qualifications = qualifications;
        this.experience = experience;
    }
    
}
