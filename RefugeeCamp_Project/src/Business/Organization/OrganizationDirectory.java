/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
        }
        else if (type.getValue().equals(Type.FoodOrganization.getValue())){
            organization = new FoodOrganization();
        }
        else if (type.getValue().equals(Type.ShelterOrganization.getValue())){
            organization = new ShelterOrganization();
        }
        else if (type.getValue().equals(Type.MedicalOrganization.getValue())){
            organization = new MedicalOrganization();
        }
        else if (type.getValue().equals(Type.ReliefWorkerOrganization.getValue())){
            organization = new ReliefWorkerOrganization();
        }
        else if (type.getValue().equals(Type.InventoryManagerOrganization.getValue())){
            organization = new InventoryManagerOrganization();
        }
         organizationList.add(organization);
        return organization;
    }
}