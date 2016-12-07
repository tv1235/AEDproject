/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vignesh
 */
public class InventoryDirectory {

    private Map<String, Integer> inventoryMap;

    public Map<String, Integer> getInventoryMap() {
        return inventoryMap;
    }

    public InventoryDirectory() {
        inventoryMap = new HashMap<String, Integer>();
    }

    public void addResource(Resource resource) {

        if (inventoryMap.containsKey(resource.getItemType())) {
            Integer count = inventoryMap.get(resource.getItemType()) + resource.getCount();
            resource.setCount(count);
            inventoryMap.put(resource.getItemType(), count);
        } else {
            inventoryMap.put(resource.getItemType(), resource.getCount());
        }
    }
    
}
