/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

/**
 *
 * @author DevidBa
 */
public class NewPerson extends Person{
    private boolean isOld;

    public NewPerson(boolean isOld, String name, String phone, String city, int age) {
        super(name, phone, city, age);
        this.isOld = isOld;
    }

    public boolean isIsOld() {
        return isOld;
    }

    public void setIsOld(boolean isOld) {
        this.isOld = isOld;
    }
    
}
