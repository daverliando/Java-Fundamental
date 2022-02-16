/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.b_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author DevidBa
 */
public class d_MapExample {
    public static void main(String[] args) {
        String nama = "Dev";
        
        Map<String,Object> employees = new HashMap<>();
        employees.put("101", "Dev");
        employees.put("102", "Joko");
        employees.put("103", "Aji");
        employees.put("104", 1);
        System.out.println(employees.get("101"));
        
        employees.put("101", "Daverliando");    //overwrite value
        
        System.out.println(employees.get("101"));
        
        Set<String> keys = employees.keySet();
//        Collection<String> values = employees.values();
        
        for (String key : keys) {
            System.out.println(key);
        }
        
//        for (String value : values) {
//            System.out.println(value);
//        }
        
    }
}
