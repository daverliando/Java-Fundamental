/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.b_collections;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DevidBa
 */
public class b_SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Dev");
        set.add("Joko");
        set.add("Aji");
        set.add("Dev");     //not added, only unique
        
        for (String nama : set) {
            System.out.println(nama);
        }
    }
}
