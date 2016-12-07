/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Refugees;

import java.util.ArrayList;

/**
 *
 * @author vignesh
 */
public class RefugeeDirectory {
    private ArrayList<Refugee> refugeeList;

    public RefugeeDirectory() {
        refugeeList = new ArrayList<Refugee>();
    }

    public ArrayList<Refugee> getRefugeeList() {
        return refugeeList;
    }
    
    public void createRefugee(Refugee refugee){
        if(Refugee.getCount() <= refugeeList.size()){
            refugee.setId(refugeeList.size() +1);
            Refugee.setCount(refugeeList.size() +2);
        }
        refugeeList.add(refugee);
    }
}
