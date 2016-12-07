/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManagerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.FoodOrganization;
import Business.Organization.MedicalOrganization;
import Business.Organization.Organization;
import Business.Organization.ShelterOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodSupplyWorkRequest;
import Business.WorkQueue.MedicalSupplyWorkRequest;
import Business.WorkQueue.ShelterAllocationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class InventoryRequestSupplyJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    private WorkRequest workRequest;

    /**
     * Creates new form RequestSupplyJPanel
     */
    public InventoryRequestSupplyJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = organization;
        this.workRequest = workRequest;
        valueLabel.setText(enterprise.getName());
        foodLabel.setVisible(false);
        foodTextField.setVisible(false);
        ShelterTextField.setVisible(false);
        shelterLabel.setVisible(false);
        MedicineLabel.setVisible(false);
        medicineTextField.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        foodRBtn = new javax.swing.JRadioButton();
        ShelterRBtn = new javax.swing.JRadioButton();
        medicalRBtn = new javax.swing.JRadioButton();
        foodLabel = new javax.swing.JLabel();
        foodTextField = new javax.swing.JTextField();
        shelterLabel = new javax.swing.JLabel();
        ShelterTextField = new javax.swing.JTextField();
        MedicineLabel = new javax.swing.JLabel();
        medicineTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Place Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        buttonGroup1.add(foodRBtn);
        foodRBtn.setText("Food Request");
        foodRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodRBtnActionPerformed(evt);
            }
        });
        add(foodRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        buttonGroup1.add(ShelterRBtn);
        ShelterRBtn.setText("Shelter Request");
        ShelterRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShelterRBtnActionPerformed(evt);
            }
        });
        add(ShelterRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        buttonGroup1.add(medicalRBtn);
        medicalRBtn.setText("Medical Kit Request");
        medicalRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalRBtnActionPerformed(evt);
            }
        });
        add(medicalRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        foodLabel.setText("Required No of Food Packets:");
        add(foodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 210, -1));
        add(foodTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 120, -1));

        shelterLabel.setText("Required No of Shelter:");
        add(shelterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, -1));
        add(ShelterTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 120, -1));

        MedicineLabel.setText("Required No of Medical Kit:");
        add(MedicineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 210, -1));
        add(medicineTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        WorkRequest request = null;
        Organization org = null;

        if (foodRBtn.isSelected()) {
            String requiredMeals = foodTextField.getText();
            int count = 0;
            if (!requiredMeals.trim().isEmpty()) {
                count = Integer.parseInt(requiredMeals) <= 0 ? 0 : Integer.parseInt(requiredMeals);
            }

            request = new FoodSupplyWorkRequest();
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FoodOrganization) {
                    org = organization;
                    break;
                }
            }
            request.setStatus("sent");
            request.setSender(userAccount);
            request.setCount(count);
            request.setMessage("Food: Inventory -> Supplier");
            JOptionPane.showMessageDialog(null, "Food Request is placed");
            
        } else if (ShelterRBtn.isSelected()) {
            String message = ShelterTextField.getText();
            int count = 0;
            if (!message.trim().isEmpty()) {
                count = Integer.parseInt(message) <= 0 ? 0 : Integer.parseInt(message);
            }

            request = new ShelterAllocationWorkRequest();
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof ShelterOrganization) {
                    org = organization;
                    break;
                }
            }
            request.setStatus("sent");
            request.setSender(userAccount);
            request.setCount(count);
            request.setMessage("Shelter: Inventory -> Supplier");
            JOptionPane.showMessageDialog(null, "Shelter Request is placed");
        } else if (medicalRBtn.isSelected()) {
            String message = medicineTextField.getText();
            int count = 0;
            if (!message.trim().isEmpty()) {
                count = Integer.parseInt(message) <= 0 ? 0 : Integer.parseInt(message);
            }
            request = new MedicalSupplyWorkRequest();
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof MedicalOrganization) {
                    org = organization;
                    break;
                }
            }
            request.setStatus("sent");
            request.setSender(userAccount);
            request.setCount(count);
            request.setMessage("Medikit: Inventory -> Supplier");
            JOptionPane.showMessageDialog(null, "Medical Request is placed");
        } else {
            org = null;
            // todo
            JOptionPane.showMessageDialog(null, "Please select a Request radio button");
            return;
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InventoryManagerWorkAreaJPanel dwjp = (InventoryManagerWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void foodRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodRBtnActionPerformed
        foodLabel.setVisible(true);
        foodTextField.setVisible(true);
        ShelterTextField.setVisible(false);
        shelterLabel.setVisible(false);
        MedicineLabel.setVisible(false);
        medicineTextField.setVisible(false);
    }//GEN-LAST:event_foodRBtnActionPerformed

    private void ShelterRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShelterRBtnActionPerformed
        foodLabel.setVisible(false);
        foodTextField.setVisible(false);
        ShelterTextField.setVisible(true);
        shelterLabel.setVisible(true);
        MedicineLabel.setVisible(false);
        medicineTextField.setVisible(false);
    }//GEN-LAST:event_ShelterRBtnActionPerformed

    private void medicalRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalRBtnActionPerformed
        // TODO add your handling code here:
        foodLabel.setVisible(false);
        foodTextField.setVisible(false);
        ShelterTextField.setVisible(false);
        shelterLabel.setVisible(false);
        MedicineLabel.setVisible(true);
        medicineTextField.setVisible(true);
    }//GEN-LAST:event_medicalRBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MedicineLabel;
    private javax.swing.JRadioButton ShelterRBtn;
    private javax.swing.JTextField ShelterTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JRadioButton foodRBtn;
    private javax.swing.JTextField foodTextField;
    private javax.swing.JRadioButton medicalRBtn;
    private javax.swing.JTextField medicineTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel shelterLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
