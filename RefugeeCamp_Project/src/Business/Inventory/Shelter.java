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
public class Shelter extends Resource {
    private String shelterName;

    public Shelter(String shelterName, int count) {
        super(Type.Shelter.getValue(), count);
        this.shelterName = shelterName;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }


}
