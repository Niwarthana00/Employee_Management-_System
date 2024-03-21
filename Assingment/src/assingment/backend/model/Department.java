/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.model;

/**
 *
 * @author MSI
 */
public class Department {
    private int id;
    private String Dcode;
    private String name;
    private String Description;

    public Department(int id, String Dcode, String name, String Description) {
        this.id = id;
        this.Dcode = Dcode;
        this.name = name;
        this.Description = Description;
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDcode() {
        return Dcode;
    }

    public void setDcode(String Dcode) {
        this.Dcode = Dcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
    
}
