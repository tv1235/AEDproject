/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

/**
 *
 * @author vignesh
 */
public class Medicine extends Resource {
    private String medicineName;
    
    public Medicine(String medicineName, int count) {
        super(Type.Medicine.getValue(), count);
        this.medicineName = medicineName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }



    
    
}
