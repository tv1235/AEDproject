/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReliefWorkerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodSupplyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestFoodJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    private WorkRequest request;

    /**
     * Creates new form RequestSupplyJPanel
     */
    public RequestFoodJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, WorkRequest request) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = organization;
        this.request = request;
        valueLabel.setText(enterprise.getName());
        if (request != null) {
            RefugeeIDJTextField.setText(request.getRefugeeIds());
            countJTextField.setText("" + request.getCount());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RefugeeIDJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        countJTextField = new javax.swing.JTextField();
        searchRefugee = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        descJTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(248, 249, 249));
        requestTestJButton.setText("Create Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel1.setText("Refugee IDs:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, -1));

        RefugeeIDJTextField.setEnabled(false);
        add(RefugeeIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 120, -1));

        backJButton.setBackground(new java.awt.Color(248, 249, 249));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jLabel2.setText("Food Request");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel3.setText("Count:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, -1));

        countJTextField.setEnabled(false);
        countJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countJTextFieldActionPerformed(evt);
            }
        });
        add(countJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 120, -1));

        searchRefugee.setBackground(new java.awt.Color(248, 249, 249));
        searchRefugee.setText("Search");
        searchRefugee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRefugeeActionPerformed(evt);
            }
        });
        add(searchRefugee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 110, -1));

        jLabel4.setText("Description:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, -1));

        descJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descJTextField1ActionPerformed(evt);
            }
        });
        add(descJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        /*String requiredMeals = countJTextField.getText();
        int count = 0;
        if (!requiredMeals.trim().isEmpty()) {
            count = Integer.parseInt(requiredMeals) <= 0 ? 0 : Integer.parseInt(requiredMeals);
        }*/
        if (request == null) {
            JOptionPane.showMessageDialog(null, "Search and add refugee Ids", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String message = descJTextField1.getText();
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof InventoryManagerOrganization) {
                org = organization;
                break;
            }
        }
        request.getSubscribedEmails().add(userAccount.getEmail());
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            EcoSystem.sendmail(userAccount.getEmail(), message+"-" +request.getStatus());
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestSupplyJPanel", new RequestSupplyJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void searchRefugeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRefugeeActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        WorkRequest foodRequest = new FoodSupplyWorkRequest();
        foodRequest.setRefugeeIds("");
        userProcessContainer.add("SearchRefugeeJPanel", new SearchRefugeeJPanel(userProcessContainer, userAccount, organization, enterprise, foodRequest));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_searchRefugeeActionPerformed

    private void countJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countJTextFieldActionPerformed

    private void descJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descJTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RefugeeIDJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField countJTextField;
    private javax.swing.JTextField descJTextField1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton searchRefugee;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
