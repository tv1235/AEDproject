/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReliefWorkerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.RefugeeCampEnterprise;
import Business.Organization.Organization;
import Business.Organization.ReliefWorkerOrganization;
import Business.Refugees.Refugee;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vignesh
 */
public class SearchRefugeeJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Set<Integer> refugeeIds;
    /**
     * Creates new form SearchRefugee
     */
    public SearchRefugeeJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = (RefugeeCampEnterprise) enterprise;
        this.userAccount = account;
        refugeeIds = new HashSet<Integer>();
        populateRefugeeTable();
    }
    public void populateRefugeeTable() {

        DefaultTableModel model = (DefaultTableModel) refugeejTable.getModel();

        model.setRowCount(0);

        for (Refugee refugee : enterprise.getRefugeeDirectory().getRefugeeList()) {
                Object row[] = new Object[3];
                row[0] = refugee;
                row[1] = refugee.getName();
                row[2] = refugee.getAge();
                ((DefaultTableModel) refugeejTable.getModel()).addRow(row);
        }
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
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchRefugeeTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        refugeejTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        selectedRefugeejTable = new javax.swing.JTable();
        removeButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Refugee ID:");

        searchRefugeeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRefugeeTextFieldActionPerformed(evt);
            }
        });

        refugeejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Refugee ID", "Refugee Name", "Age"
            }
        ));
        jScrollPane2.setViewportView(refugeejTable);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        selectedRefugeejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Refugee ID", "Refugee Name", "Age"
            }
        ));
        jScrollPane3.setViewportView(selectedRefugeejTable);

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(searchRefugeeTextField)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchRefugeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(nextButton))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchRefugeeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRefugeeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchRefugeeTextFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if (searchRefugeeTextField != null && !searchRefugeeTextField.getText().trim().isEmpty()) {
            int searchId = Integer.parseInt(searchRefugeeTextField.getText());
            DefaultTableModel model = (DefaultTableModel) refugeejTable.getModel();

            model.setRowCount(0);

            for (Refugee refugee : enterprise.getRefugeeDirectory().getRefugeeList()) {
                if (refugee.getId() == searchId) {
                    Object row[] = new Object[3];
                    row[0] = refugee;
                    row[1] = refugee.getName();
                    row[2] = refugee.getAge();
                    ((DefaultTableModel) refugeejTable.getModel()).addRow(row);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter refugee name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = refugeejTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "select a row first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        Refugee refugee = (Refugee)refugeejTable.getValueAt(selectedRow, 0);
        
        if(refugeeIds.contains(refugee.getId())){
            JOptionPane.showMessageDialog(null, "already added", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        DefaultTableModel model = (DefaultTableModel) selectedRefugeejTable.getModel();
        Object row[] = new Object[3];
        row[0] = refugee;
        row[1] = refugee.getName();
        row[2] = refugee.getAge();
        ((DefaultTableModel) selectedRefugeejTable.getModel()).addRow(row);
        refugeeIds.add(refugee.getId());
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = selectedRefugeejTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "select a row first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Refugee refugee = (Refugee)selectedRefugeejTable.getValueAt(selectedRow, 0);
        
        refugeeIds.remove(refugee.getId());
        DefaultTableModel model = (DefaultTableModel) selectedRefugeejTable.getModel();
        ((DefaultTableModel) selectedRefugeejTable.getModel()).removeRow(selectedRow);
        
    }//GEN-LAST:event_removeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton nextButton;
    private javax.swing.JTable refugeejTable;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchRefugeeTextField;
    private javax.swing.JTable selectedRefugeejTable;
    // End of variables declaration//GEN-END:variables
}
