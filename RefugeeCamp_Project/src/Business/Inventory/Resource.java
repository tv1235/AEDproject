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
public abstract class Resource {
    
    private String itemType;
    private int count;


    public String getItemType() {
        return itemType;
    }
    
    public enum Type{
        Food("Food"), Shelter("Shelter"), Medicine("Medicine");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Resource(String itemType, int count) {
        this.itemType = itemType;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
        @Override
    public int hashCode() {
        return itemType.hashCode();
    }

    @Override
    public boolean equals(Object o){
        return this.itemType.equals(o);
    }
    
}
