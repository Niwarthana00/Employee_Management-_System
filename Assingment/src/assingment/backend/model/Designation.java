/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.model;

/**
 *
 * @author MSI
 */
public class Designation {
    private int id;
    private String name;

    public Designation() {
    }
    
    public Designation(int id, String name) {
        this.id = id;
        this.name = name;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
