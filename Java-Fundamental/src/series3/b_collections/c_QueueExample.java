/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.b_collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author DevidBa
 */
public class c_QueueExample {
    public static void main(String[] args) {
        //LIFO -> Last In First Out
        Deque<String> listNama = new ArrayDeque<>();
        listNama.push("Dev");
        listNama.push("Joko");
        listNama.push("Aji");
        
        for (String nama : listNama) {
            System.out.println(nama);
        }
        
        //FIFO -> First In First Out
        Deque<String> listNama2 = new ArrayDeque<>();
        listNama.add("Dev");
        listNama.add("Joko");
        listNama.add("Aji");
        
        for (String nama : listNama) {
            System.out.println(nama);
        }
    }
}
