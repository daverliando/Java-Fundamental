/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DevidBa
 * Sorting
 * 
 */
public class Example02 {
    public static void main(String[] args) {
        List<Person> persons = Data.getData();
        
        persons.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
    }
}
