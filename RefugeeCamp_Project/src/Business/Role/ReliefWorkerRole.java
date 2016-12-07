/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReliefWorkerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ReliefWorkerRole.ReliefWorkerWorkAreaJPanel;

/**
 *
 * @author vignesh
 */
public class ReliefWorkerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new ReliefWorkerWorkAreaJPanel(userProcessContainer, account, (ReliefWorkerOrganization)organization, enterprise);
    }
    
}
