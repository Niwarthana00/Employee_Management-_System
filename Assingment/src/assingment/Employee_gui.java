/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assingment;

import support_files.IntegerOnlyFilter;
import assingment.backend.model.Department;
import assingment.backend.model.Designation;
import assingment.backend.model.Employee;
import assingment.backend.model.LocalStorage;
import assingment.backend.services.Department_service;
import assingment.backend.services.Designation_service;
import assingment.backend.services.Employee_service;
import assingment.backend.services.Validation_service;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class Employee_gui extends javax.swing.JFrame {
    Validation_service validation = new Validation_service();
    private int id = 0;
    private String email_for_delete = "";
    
    public Employee_gui() {
        initComponents();
        load_designation();
        load_department();
        fun_desable_update_delete();
        view_table();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        txtEpf = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtBOD = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        comboDepartment = new javax.swing.JComboBox<>();
        comboDesignation = new javax.swing.JComboBox<>();
        txtExperince = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Employee Registration Form");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 510, 50));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 0, 51));
        jLabel29.setText("Name :");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 40));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 0, 51));
        jLabel30.setText("EPF NO :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 0, 51));
        jLabel31.setText("NIC :");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        txtNIC.setBackground(new java.awt.Color(255, 255, 255));
        txtNIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNIC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });
        jPanel1.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 240, 40));

        txtEpf.setBackground(new java.awt.Color(255, 255, 255));
        txtEpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEpf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtEpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEpfActionPerformed(evt);
            }
        });
        jPanel1.add(txtEpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 240, 40));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 0, 51));
        jLabel32.setText("Designation :");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 0, 51));
        jLabel33.setText("Department :");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 20));

        jLabel34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 0, 51));
        jLabel34.setText("Salary :");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        txtSalary.setBackground(new java.awt.Color(255, 255, 255));
        txtSalary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 240, 40));

        jLabel36.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 0, 51));
        jLabel36.setText("Phone Number:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 0, 51));
        jLabel37.setText("Qualifications :");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txtBOD.setBackground(new java.awt.Color(255, 255, 255));
        txtBOD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBOD.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtBOD.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBODCaretUpdate(evt);
            }
        });
        txtBOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBODActionPerformed(evt);
            }
        });
        jPanel1.add(txtBOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 40));

        jLabel39.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 0, 51));
        jLabel39.setText("BOD :");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 240, 40));

        jLabel40.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 0, 51));
        jLabel40.setText("Email :");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        txtQualification.setBackground(new java.awt.Color(255, 255, 255));
        txtQualification.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQualification.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationActionPerformed(evt);
            }
        });
        jPanel1.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 630, 40));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 240, 40));

        comboDepartment.setBackground(new java.awt.Color(255, 255, 255));
        comboDepartment.setForeground(new java.awt.Color(51, 0, 51));
        comboDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        comboDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        jPanel1.add(comboDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 250, 40));

        comboDesignation.setBackground(new java.awt.Color(255, 255, 255));
        comboDesignation.setForeground(new java.awt.Color(51, 0, 51));
        comboDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Designation" }));
        comboDesignation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        jPanel1.add(comboDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 250, 40));

        txtExperince.setBackground(new java.awt.Color(255, 255, 255));
        txtExperince.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtExperince.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtExperince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExperinceActionPerformed(evt);
            }
        });
        jPanel1.add(txtExperince, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 140, 40));

        jLabel41.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 0, 51));
        jLabel41.setText("Experience :");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        tblEmp.setBackground(new java.awt.Color(51, 51, 51));
        tblEmp.setForeground(new java.awt.Color(255, 255, 255));
        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "EPF NO", "NIC", "Designation", "Department", "Salary", "BOD", "Tel", "Experience", "Qualification", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEmp.setGridColor(new java.awt.Color(153, 153, 153));
        tblEmp.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tblEmp.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmp);
        if (tblEmp.getColumnModel().getColumnCount() > 0) {
            tblEmp.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 800, 180));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 120, 40));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 120, 40));

        btnSave.setBackground(new java.awt.Color(51, 0, 51));
        btnSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 120, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, 20));

        btnClear.setBackground(new java.awt.Color(102, 0, 51));
        btnClear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 840, 830));

        jPanel2.setBackground(new java.awt.Color(64, 5, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("C.I.S");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 60));

        jLabel10.setFont(new java.awt.Font("Sitka Banner", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Colombo Institute Of Studies");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 40));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assingment/img/log.png"))); // NOI18N
        jLabel5.setText("  Logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 200, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 760));

        setSize(new java.awt.Dimension(1038, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICActionPerformed

    private void txtEpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpfActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtBODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBODActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtExperinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExperinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperinceActionPerformed

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        fun_enable_update_delete();
        int rowIndex = tblEmp.getSelectedRow();

        if (rowIndex != -1) {
            DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();

            id = (int) model.getValueAt(rowIndex, 0);
            email_for_delete = (String) model.getValueAt(rowIndex, 2);
           
            txtName.setText((String) model.getValueAt(rowIndex, 1));
            txtEpf.setText((String) model.getValueAt(rowIndex, 2));
            txtNIC.setText((String) model.getValueAt(rowIndex, 3));
            txtTel.setText((String) model.getValueAt(rowIndex, 4));
            txtEmail.setText((String) model.getValueAt(rowIndex, 5));
            comboDesignation.setSelectedItem((String) model.getValueAt(rowIndex, 6));
            comboDepartment.setSelectedItem((String) model.getValueAt(rowIndex, 7));
            txtSalary.setText((String) model.getValueAt(rowIndex, 8));
            txtBOD.setText((String) model.getValueAt(rowIndex, 9));
            txtExperince.setText((String) model.getValueAt(rowIndex, 10).toString());
            txtQualification.setText((String) model.getValueAt(rowIndex,11));
                
            txtNIC.setEnabled(false);
            txtTel.setEnabled(false);
            txtBOD.setEnabled(false);
            txtEmail.setEnabled(false);
            txtEpf.setEnabled(false);
            
            Border redBorder = BorderFactory.createLineBorder(Color.RED);
            txtNIC.setBorder(redBorder);
            txtTel.setBorder(redBorder);
            txtBOD.setBorder(redBorder);
            txtEmail.setBorder(redBorder);
            txtEpf.setBorder(redBorder);

        }
    }//GEN-LAST:event_tblEmpMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Confirmation", JOptionPane.YES_NO_OPTION);
        String name = txtName.getText();
        String designation = (String) comboDesignation.getSelectedItem();
        String department = (String) comboDepartment.getSelectedItem();
        String emsal_txt = txtSalary.getText();
        String emqua_txt = txtQualification.getText();
        String emex_txt = txtExperince.getText(); 
        
        if (choice == JOptionPane.YES_OPTION) {
            Employee employee = new Employee();
            employee.updateEmp(name , designation , department , emsal_txt , emqua_txt , emex_txt);
            
            Employee_service emp_service = new Employee_service();
            boolean update_status = emp_service.updateEMP(id ,employee);
            
            if (update_status) {
                view_table();
                fun_desable_update_delete();
                clearfun();
                JOptionPane.showMessageDialog(null, "Employee updated successfully", "Update Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update Designation", "Update Status", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            
            Employee emp = new Employee();
            emp.setId(id);
            
            Employee_service emp_service = new Employee_service();
            boolean delete_status = emp_service.deleteEMP(emp);
            if (delete_status) {
                view_table();
                fun_desable_update_delete();
                clearfun();
                JOptionPane.showMessageDialog(null, "Emploeyee deleted successfully", "Delete Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete department", "Delete Status", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cancel deleting.", "Cancel Delete", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String txt_name = txtName.getText();
        String txt_epf = txtEpf.getText();
        String txt_nic = txtNIC.getText();
        String txt_designation = (String) comboDesignation.getSelectedItem();
        String txt_department = (String) comboDepartment.getSelectedItem();
        String txt_salary = txtSalary.getText();
        String txt_bod = txtBOD.getText();
        String txt_tel = txtTel.getText();
        String txt_email = txtEmail.getText();
        String txt_qualification = txtQualification.getText();
        String txt_experince = txtExperince.getText();

        boolean isValid = true;
        StringBuilder errorMessage = new StringBuilder();
        
        if (!validation.isValidNIC(txt_nic)) {
            isValid = false;
            errorMessage.append("Please enter a valid NIC number.\n");
        }

        if (!validation.isValidEmail(txt_email)) {
            isValid = false;
            errorMessage.append("Please enter a valid email address.\n");
        }

        if (!validation.isValidPhoneNumber(txt_tel)) {
            isValid = false;
            errorMessage.append("Please enter a valid telephone number.\n");
        }
        
        if (!validation.lengthValidate(txt_epf, 4)) {
            isValid = false;
            errorMessage.append("Please enter valid EPF Number.\n");
        }
        if (!validation.isValidBirthday(txt_bod)) {
            isValid = false;
            errorMessage.append("Please enter a valid birthday.\n");
}


        if (txt_name.isEmpty() || txt_epf.isEmpty() || txt_nic.isEmpty() ||
            txt_salary.isEmpty() || txt_bod.isEmpty() || txt_tel.isEmpty() ||
            txt_email.isEmpty() || txt_qualification.isEmpty() || txt_experince.isEmpty()) {
            isValid = false;
            errorMessage.append("Please fill in all required fields.\n");
        }

        if (!isValid) {
            JOptionPane.showMessageDialog(this, errorMessage.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            Employee employee = new Employee( 0,txt_epf, txt_name,txt_department,txt_designation,txt_bod,txt_tel,txt_email,txt_salary,"Available",txt_qualification,txt_experince,txt_nic);
            Employee_service emp_service = new Employee_service();
            boolean save_status = emp_service.createEMP(employee);
            if (save_status) {
                fun_desable_update_delete();
                JOptionPane.showMessageDialog(null, "Employee is saved", "Save Successful", JOptionPane.INFORMATION_MESSAGE);
                clearfun();
                view_table();
            }else{
                JOptionPane.showMessageDialog(null, "Data saving failed.", "Save Failed", JOptionPane.ERROR_MESSAGE);

            }
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBODCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBODCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBODCaretUpdate

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        LocalStorage storage = new LocalStorage();
        if("Admin".equals(storage.getData("actor"))){
            this.setVisible(false);
            Admin_gui adminForm = new Admin_gui();
            adminForm.setVisible(true);
        }else if("HR Manager".equals(storage.getData("actor"))){
            this.setVisible(false);
            HR_Manager_dashboard hrManagerDash = new HR_Manager_dashboard();
            hrManagerDash.setVisible(true);
        }

    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearfun();
        fun_desable_update_delete();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Login form = new Login();
            form.setVisible(true);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Login form = new Login();
            form.setVisible(true);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JComboBox<String> comboDesignation;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtBOD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEpf;
    private javax.swing.JTextField txtExperince;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables


    private void load_designation() {
       Designation_service desi_service = new Designation_service();
       List<Designation> designations = desi_service.dataToCombo();
   
       
       for (Designation designation : designations) {
           int id = designation.getId() ;
           String name = designation.getName();
           
           comboDesignation.addItem(id+ " - "+name);
        }

    }

    private void load_department() {
       Department_service dpt_service = new Department_service();
       List<Department> dpts = dpt_service.dataToCombo();
      
       
       for (Department one_dpt : dpts) {
           int id = one_dpt.getId() ;
           String name = one_dpt.getName();
           
           comboDepartment.addItem(id+ " - "+name);
        }    
    }

    private void fun_desable_update_delete() {
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
        
        txtNIC.setEnabled(true);
        txtTel.setEnabled(true);
        txtBOD.setEnabled(true);
        txtEmail.setEnabled(true);
        txtEpf.setEnabled(true);
        
        Border redBorder = BorderFactory.createLineBorder(Color.black);
        txtNIC.setBorder(redBorder);
        txtTel.setBorder(redBorder);
        txtBOD.setBorder(redBorder);
        txtEmail.setBorder(redBorder);
        txtEpf.setBorder(redBorder);
    }

   private void clearfun() {

        txtName.setText("");
        txtEpf.setText("");
        txtNIC.setText("");
        comboDesignation.setSelectedIndex(0); 
        comboDepartment.setSelectedIndex(0);
        txtSalary.setText("");
        txtBOD.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtQualification.setText("");
        txtExperince.setText("");
    }


    private void view_table() {
        Employee_service emp_service = new Employee_service();
        List<Employee> emp_list = emp_service.retrieveAllEMP();
    
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("EPF NO");
            model.addColumn("NIC");
            model.addColumn("Tel");
            model.addColumn("Email");
            model.addColumn("Designation");
            model.addColumn("Department");
            model.addColumn("Salary");
            model.addColumn("BOD");  
            model.addColumn("Experience");
            model.addColumn("Qualification");
            
            for (Employee one_emp : emp_list) {
                model.addRow(new Object[]{
                    one_emp.getId(),
                    one_emp.getName(),
                    one_emp.getEpf_num(),
                    one_emp.getNic(),
                    one_emp.getPhoneNumber(),
                    one_emp.getEmail(),
                    one_emp.getDesignation(),
                    one_emp.getDepartment(),
                    one_emp.getSalary(),
                    one_emp.getBod(),
                    one_emp.getExperience(),
                    one_emp.getQualifications()
            });
        }

        tblEmp.setModel(model);    
    }

    private void fun_enable_update_delete() {
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
    }
}
