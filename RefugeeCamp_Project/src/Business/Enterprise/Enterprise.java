/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.InventoryDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Refugees.RefugeeDirectory;

/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private RefugeeDirectory refugeeDirectory;
    private InventoryDirectory inventoryDirectory;

    public RefugeeDirectory getRefugeeDirectory() {
        return refugeeDirectory;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }
    
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        refugeeDirectory = new RefugeeDirectory();
        inventoryDirectory = new InventoryDirectory();
    }
    
    public enum EnterpriseType{
        Supplier("Supplier Organization"),
        RefugeeCamp("RefugeeCamp");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
