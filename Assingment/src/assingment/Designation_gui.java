/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assingment;

import assingment.backend.model.Designation;
import assingment.backend.model.LocalStorage;
import assingment.backend.services.Designation_service;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class Designation_gui extends javax.swing.JFrame {
    private int id = 0;
    
    
    public Designation_gui() {
        initComponents();
        up.setEnabled(false);
        dele.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        desiname = new javax.swing.JTextField();
        up = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        designationTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        dele = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(64, 5, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C.I.S");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 60));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Colombo Institute Of Studies");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 40));

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

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 200, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Designation");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 210, 83));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 0, 51));
        jLabel29.setText("Name :");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        desiname.setBackground(new java.awt.Color(255, 255, 255));
        desiname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        desiname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 170, 227)));
        desiname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desinameActionPerformed(evt);
            }
        });
        jPanel3.add(desiname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 610, 40));

        up.setBackground(new java.awt.Color(0, 51, 51));
        up.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        up.setForeground(new java.awt.Color(255, 255, 255));
        up.setText("Update");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel3.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 120, 40));

        designationTable.setBackground(new java.awt.Color(51, 51, 51));
        designationTable.setForeground(new java.awt.Color(255, 255, 255));
        designationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Designation ID", "Designation Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        designationTable.setGridColor(new java.awt.Color(153, 153, 153));
        designationTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        designationTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        designationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                designationTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(designationTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 670, 250));

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 120, 40));

        dele.setBackground(new java.awt.Color(204, 0, 0));
        dele.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dele.setForeground(new java.awt.Color(255, 255, 255));
        dele.setText("Delete");
        dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleActionPerformed(evt);
            }
        });
        jPanel3.add(dele, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 120, 40));

        btnClear.setBackground(new java.awt.Color(102, 0, 51));
        btnClear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 740, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(940, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void desinameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desinameActionPerformed

    }//GEN-LAST:event_desinameActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            String name_txt = desiname.getText();
            if (name_txt.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Warning", JOptionPane.WARNING_MESSAGE);

            }else{
                
                Designation_service des_service = new Designation_service();
                boolean status = des_service.updateDES(id, name_txt);
                if (status) {
                    view_table();
                    fun_desable_update_delete();
                    clearfun();
                    

                    JOptionPane.showMessageDialog(null, "Designation updated successfully", "Update Status", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update Designation", "Update Status", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cancel updating.", "Cancel Update", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_upActionPerformed

    private void designationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_designationTableMouseClicked
        int selectedRowIndex = designationTable.getSelectedRow();
        if (selectedRowIndex != -1) {

            int id_txt = (int) designationTable.getValueAt(selectedRowIndex, 0);
            Object name_txt = designationTable.getValueAt(selectedRowIndex, 1);

            fun_enable_update_delete();

            id=id_txt;
            desiname.setText((String) name_txt);

        } else {
            JOptionPane.showMessageDialog(null, "No data from this id","No Data" , JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_designationTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String dname = desiname.getText();
        if (dname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Warning", JOptionPane.WARNING_MESSAGE);

        }else{
            Designation desi = new Designation(0,  dname);
            Designation_service desi_service = new Designation_service();
            boolean save_status = desi_service.createDES(desi);
            if (save_status) {
                fun_desable_update_delete();
                JOptionPane.showMessageDialog(null, "Designation is saved", "Save Successful", JOptionPane.INFORMATION_MESSAGE);
                clearfun();
                view_table();
            }else{
                JOptionPane.showMessageDialog(null, "Data saving failed.", "Save Failed", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            Designation DES = new  Designation();
            DES.setId(id);

            Designation_service desi_service = new Designation_service();
            boolean delete_status = desi_service.deleteDES(id);
            if (delete_status) {
                view_table();
                fun_desable_update_delete();
                clearfun();
                
                JOptionPane.showMessageDialog(null, "Designation deleted successfully", "Delete Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete designation", "Delete Status", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cancel deleting.", "Cancel Delete", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_deleActionPerformed

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
        
        System.out.print(storage.getData("actor"));
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Designation_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Designation_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Designation_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Designation_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Designation_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton dele;
    private javax.swing.JTable designationTable;
    private javax.swing.JTextField desiname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables

    private void fun_desable_update_delete() {
     dele.setEnabled(false);
     up.setEnabled(false);
     jButton2.setEnabled(true);   
    }
    
      private void fun_enable_update_delete() {
        dele.setEnabled(true);
        up.setEnabled(true);
        jButton2.setEnabled(false);
    }
  
public void clearfun() { 
        desiname.setText("");
    }

    private void view_table() {
        
        Designation_service des_service = new Designation_service();
        List<Designation> designations = des_service.retrieveAllDES();
    
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
    
        for (Designation designation : designations) {
            model.addRow(new Object[]{
                designation.getId(),
                designation.getName(),
            });
        }

        designationTable.setModel(model);

    }
}