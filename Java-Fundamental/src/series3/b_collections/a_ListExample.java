/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.b_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DevidBa
 */
public class a_ListExample {
    public static void main(String[] args) {
        List<String> listNama = new ArrayList<>();
        List<String> listNama2 = new LinkedList<>();
        listNama.add("Dev");    //index 0
        listNama.add("Joko");   //index 1
        listNama.add("Aji");    //index 2
        listNama2.add("Aji");    //index 0
        
        for (String nama : listNama) {
            System.out.println(nama);
        }
    }
}
