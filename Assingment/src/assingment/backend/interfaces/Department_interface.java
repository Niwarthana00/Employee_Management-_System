/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.interfaces;

import assingment.backend.model.Department;
import java.util.List;

/**
 *
 * @author MSI
 */
public interface Department_interface {
    boolean createDPT(Department dptob);
    public List<Department> readDPT(int id);
    boolean updateDPT(int id, Department dptob);
    boolean deleteDPT(int id);     
    List<Department> retrieveAllDepartments();
    List<Department> dataToCombo();
}
