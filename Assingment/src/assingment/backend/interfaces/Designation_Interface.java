/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.interfaces;

import assingment.backend.model.Department;
import assingment.backend.model.Designation;
import java.util.List;

public interface Designation_Interface
{
    boolean createDES(Designation dstob);
    public List<Designation> readDES(int id);
    boolean updateDES(int id, String name);
    boolean deleteDES(int id);   
    List<Designation> retrieveAllDES();
    List<Designation> dataToCombo();
}

