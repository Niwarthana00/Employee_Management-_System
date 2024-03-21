/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assingment;

import assingment.backend.model.HR_Assistant;
import assingment.backend.model.LocalStorage;
import assingment.backend.services.Hr_Assistant_Service;
import assingment.backend.services.User_service;
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
public class HR_Assistant_gui extends javax.swing.JFrame {
    private String pass = "";
    private String email_for_delete = "";
    private int  id = 0;
    Validation_service validation = new Validation_service();

    public HR_Assistant_gui() {
        initComponents();
        view_table();
        fun_desable_update_delete();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtxDesignation = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtBOD = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtEducationEx = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtWorkingExperince = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hrtable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(64, 5, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Colombo Institute Of Studies");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 40));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C.I.S");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 60));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 200, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 720));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 240, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("HR Assistant Registration Form");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 510, 90));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 0, 51));
        jLabel29.setText("Name :");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, 40));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 0, 51));
        jLabel30.setText("Address :");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 240, 40));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 0, 51));
        jLabel31.setText("Designation :");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        txtxDesignation.setBackground(new java.awt.Color(255, 255, 255));
        txtxDesignation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtxDesignation.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtxDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtxDesignationActionPerformed(evt);
            }
        });
        jPanel3.add(txtxDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 240, 40));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 0, 51));
        jLabel32.setText("Email :");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 0, 51));
        jLabel33.setText("BOD :");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 0, 51));
        jLabel34.setText("NIC :");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtBOD.setBackground(new java.awt.Color(255, 255, 255));
        txtBOD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBOD.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtBOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBODActionPerformed(evt);
            }
        });
        jPanel3.add(txtBOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 240, 40));

        txtNIC.setBackground(new java.awt.Color(255, 255, 255));
        txtNIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNIC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });
        jPanel3.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 40));

        txtEducationEx.setBackground(new java.awt.Color(255, 255, 255));
        txtEducationEx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEducationEx.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtEducationEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEducationExActionPerformed(evt);
            }
        });
        jPanel3.add(txtEducationEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 420, 40));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 0, 51));
        jLabel35.setText("Education Qualification :");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, -1));

        txtWorkingExperince.setBackground(new java.awt.Color(255, 255, 255));
        txtWorkingExperince.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtWorkingExperince.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtWorkingExperince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkingExperinceActionPerformed(evt);
            }
        });
        jPanel3.add(txtWorkingExperince, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 40));

        jLabel36.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 0, 51));
        jLabel36.setText("Working Ex :");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnClear.setBackground(new java.awt.Color(102, 0, 51));
        btnClear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 120, 40));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 120, 40));

        btnSave.setBackground(new java.awt.Color(51, 0, 51));
        btnSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 120, 40));

        hrtable.setBackground(new java.awt.Color(51, 51, 51));
        hrtable.setForeground(new java.awt.Color(255, 255, 255));
        hrtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HR ID", "Name", "Address", "Join date", "Designation", "Tel", "Email", "BOD", "qualification", "Work experience", "NIC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hrtable.setGridColor(new java.awt.Color(153, 153, 153));
        hrtable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        hrtable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        hrtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hrtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(hrtable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 800, 230));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, 20));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        jPanel3.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 210, 40));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 0, 51));
        jLabel37.setText("Tel :");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 90, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 120, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 840, 720));

        setSize(new java.awt.Dimension(1038, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtxDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtxDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtxDesignationActionPerformed

    private void txtBODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBODActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICActionPerformed

    private void txtEducationExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEducationExActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEducationExActionPerformed

    private void txtWorkingExperinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkingExperinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkingExperinceActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearfun();
        fun_desable_update_delete();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {

            HR_Assistant hrm = new HR_Assistant();
            hrm.setId(id);

            Hr_Assistant_Service hra_service = new Hr_Assistant_Service();
            boolean delete_status = hra_service.deleteUser(id , email_for_delete);
            if (delete_status) {
                view_table();
                fun_desable_update_delete();
                clearfun();
                JOptionPane.showMessageDialog(null, "HR Assistant deleted successfully", "Delete Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete HR Assistant", "Delete Status", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cancel deleting.", "Cancel Delete", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        User_service user_service = new User_service();
        String name_txt = txtName.getText();
        String address_txt = txtAddress.getText();
        String designation_txt = txtxDesignation.getText();
        String dob_txt = txtBOD.getText();
        String email_txt = txtEmail.getText();
        String nic_txt = txtNIC.getText();
        String passs = user_service.password_generate();
        String education_qualification_txt = txtEducationEx.getText();
        String tel = txtTel.getText();
        int working_experience = Integer.parseInt(txtWorkingExperince.getText());
        
        boolean isValid = true;
        StringBuilder errorMessage = new StringBuilder();

        if (!validation.isValidNIC(nic_txt)) {
            isValid = false;
            errorMessage.append("Please enter a valid NIC number.\n");
        }
        
        if (!validation.isValidEmail(email_txt)) {
            isValid = false;
            errorMessage.append("Please enter a valid email address.\n");
        }
        
        if (!validation.isValidPhoneNumber(tel)) {
            isValid = false;
            errorMessage.append("Please enter a valid telephone number.\n");
        }
        
        if (name_txt.isEmpty() || address_txt.isEmpty() || nic_txt.isEmpty() || dob_txt.isEmpty() || email_txt.isEmpty() || education_qualification_txt.isEmpty()) {
            isValid = false;
            errorMessage.append("Please fill in all required fields.\n");
        }
        
        if (!isValid) {
            JOptionPane.showMessageDialog(this, errorMessage.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            HR_Assistant hra = new HR_Assistant (name_txt , address_txt, designation_txt, nic_txt, dob_txt, working_experience , education_qualification_txt, 0 , email_txt, passs, "HR Assistant", tel, "2014-02-10");
            Hr_Assistant_Service hrasi_service = new Hr_Assistant_Service();
            boolean save_status = hrasi_service.createUser(hra);
            if (save_status) {
                fun_desable_update_delete();
                JOptionPane.showMessageDialog(null, "HR Assistance is saved. Password is "+passs, "Save Successful", JOptionPane.INFORMATION_MESSAGE);
                clearfun();
                view_table();
                
                User_service usr_service = new User_service();
                usr_service.download_password(passs , email_txt);
            }else{
                JOptionPane.showMessageDialog(null, "Data saving failed.", "Save Failed", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void hrtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrtableMouseClicked
        int rowIndex = hrtable.getSelectedRow();

        if (rowIndex != -1) {
            DefaultTableModel model = (DefaultTableModel) hrtable.getModel();

            id = (int) model.getValueAt(rowIndex, 0);
            email_for_delete =  (String) model.getValueAt(rowIndex, 6);
            
            txtName.setText((String) model.getValueAt(rowIndex, 1));
            txtAddress.setText((String) model.getValueAt(rowIndex, 2));
            txtxDesignation.setText((String) model.getValueAt(rowIndex, 3));
            txtBOD.setText((String) model.getValueAt(rowIndex, 4));
            txtNIC.setText((String) model.getValueAt(rowIndex, 5));
            txtEmail.setText((String) model.getValueAt(rowIndex, 6));
            txtTel.setText((String) model.getValueAt(rowIndex, 9));
            txtEducationEx.setText((String) model.getValueAt(rowIndex, 8).toString());
            txtWorkingExperince.setText(model.getValueAt(rowIndex, 7).toString());
        }
        
        txtNIC.setEnabled(false);
        txtTel.setEnabled(false);
        txtBOD.setEnabled(false);
        txtEmail.setEnabled(false);

        Border pupleBoreder = BorderFactory.createLineBorder(new Color(209, 170, 227));
        txtNIC.setBorder(pupleBoreder);
        txtTel.setBorder(pupleBoreder);
        txtBOD.setBorder(pupleBoreder);
        txtEmail.setBorder(pupleBoreder);
        
        fun_enable_update_delete();
    }//GEN-LAST:event_hrtableMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
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
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Confirmation", JOptionPane.YES_NO_OPTION);
        String name_txt = txtName.getText();
        String address_txt = txtAddress.getText();
        String designation_txt = txtxDesignation.getText();
        String education_qualification_txt = txtEducationEx.getText();
        int working_experience = Integer.parseInt(txtWorkingExperince.getText());
        
         if (name_txt.isEmpty() || address_txt.isEmpty() || designation_txt.isEmpty() || education_qualification_txt.isEmpty() || txtWorkingExperince.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (choice == JOptionPane.YES_OPTION) {
            HR_Assistant assistant = new HR_Assistant();
            assistant.updateSet(name_txt, address_txt, designation_txt, working_experience, education_qualification_txt, "");
            
            Hr_Assistant_Service assis_service = new Hr_Assistant_Service();
            boolean update_status = assis_service.updateUser(id , assistant);
            if (update_status) {
                view_table();
                fun_desable_update_delete();
                clearfun();

                JOptionPane.showMessageDialog(null, "HR Assistant updated successfully", "Update Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update department", "Update Status", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Login form = new Login();
            form.setVisible(true);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Login form = new Login();
            form.setVisible(true);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

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
            java.util.logging.Logger.getLogger(HR_Assistant_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HR_Assistant_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HR_Assistant_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HR_Assistant_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HR_Assistant_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable hrtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBOD;
    private javax.swing.JTextField txtEducationEx;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtWorkingExperince;
    private javax.swing.JTextField txtxDesignation;
    // End of variables declaration//GEN-END:variables

    private void fun_desable_update_delete() {
        btnDelete.setEnabled(false);
        btnClear.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        
        txtNIC.setEnabled(true);
        txtTel.setEnabled(true);
        txtBOD.setEnabled(true);
        txtEmail.setEnabled(true);

        Border redBorder = BorderFactory.createLineBorder(Color.black);
        txtNIC.setBorder(redBorder);
        txtTel.setBorder(redBorder);
        txtBOD.setBorder(redBorder);
        txtEmail.setBorder(redBorder);  
    }
    private void fun_enable_update_delete() {
     btnDelete.setEnabled(true);
     btnUpdate.setEnabled(true);
     btnSave.setEnabled(false);
    }

    private void view_table() {
        Hr_Assistant_Service hras_service = new Hr_Assistant_Service();
        List<HR_Assistant> hrasis = hras_service.retrieveAllUsers();
    
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Designation");
        model.addColumn("BOD");
        model.addColumn("NIC");
        model.addColumn("Email");
        model.addColumn("Working Experince");
        model.addColumn("Education Qualification");
        model.addColumn("Telephone Number");
    
        for (HR_Assistant hras_servicne : hrasis) {
            model.addRow(new Object[]{
                hras_servicne.getId(),
                hras_servicne.getName(),
                hras_servicne.getAddress(),
                hras_servicne.getDesignation(),
                hras_servicne.getBod(),
                hras_servicne.getNic(),
                hras_servicne.getEmail(),
                hras_servicne.getWorking_experince(),
                hras_servicne.getEducation_qualification(),
                hras_servicne.getTelephoneNumber(),
        });
        }

        hrtable.setModel(model);    
    }

    private void clearfun() {
        txtName.setText("");
        txtAddress.setText("");
        txtxDesignation.setText("");
        txtBOD.setText("");
        txtEmail.setText("");
        txtNIC.setText("");
        txtEducationEx.setText("");
        txtWorkingExperince.setText("");
        txtTel.setText("");
    }
}

    
    
