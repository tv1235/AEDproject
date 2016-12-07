/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vignesh
 */
public class MedicalOrganization extends Organization{

     public MedicalOrganization() {
        super(Organization.Type.MedicalOrg.getValue());
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalSupplierRole());
        return roles;
    }
    
}
