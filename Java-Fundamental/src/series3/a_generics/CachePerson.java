/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.a_generics;

/**
 *
 * @author DevidBa
 */
public class CachePerson {
    private Person p;

    public Person get() {
        return p;
    }

    public void add(Person p) {
        this.p = p;
    }
}
