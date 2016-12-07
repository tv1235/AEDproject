/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Refugees;

/**
 *
 * @author vignesh
 */
public class Refugee {
    private static int count = 1;
    private int id;
    private String name;
    private String originCountry;
    private int age;
    private boolean sex;
    private boolean needsMedicalAttn;
    private boolean hasAccomodation;
    private boolean physicallyChallenged;
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
    public Refugee() {
    id = count;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Refugee.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean needsMedicalAttn() {
        return needsMedicalAttn;
    }

    @Override
    public String toString() {
        return "" + id;
    }

    public void setNeedsMedicalAttn(boolean needsMedicalAttn) {
        this.needsMedicalAttn = needsMedicalAttn;
    }

    public boolean hasAccomodation() {
        return hasAccomodation;
    }

    public void setHasAccomodation(boolean hasAccomodation) {
        this.hasAccomodation = hasAccomodation;
    }

    public boolean isPhysicallyChallenged() {
        return physicallyChallenged;
    }

    public void setPhysicallyChallenged(boolean physicallyChallenged) {
        this.physicallyChallenged = physicallyChallenged;
    }

    
}
