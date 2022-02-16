/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author DevidBa
 */
public class Example01 {

    public static void main(String[] args) {
        List<Person> persons = Data.getData();
        
        //Print with foreach
//        persons.forEach(p -> System.out.println(p));
//        System.out.println("===================");
        
//        Consumer c = x -> System.out.println(x);
//        persons.forEach(c);
//        System.out.println("===================");
//

//        Stream<Person> s = persons.stream();
        
//      WHERE age >= 25
//        persons.stream()
//                .filter(p -> p.getAge() >= 25)
//                .forEach(c);
        
//        Save to List
//        System.out.println("===================");
//
        Predicate<Person> select
                = p -> p.getAge() > 21 && p.getCity().contains("a");

        
//        Stream Filter Version
        List<Person> selectedPerson = persons.stream()
                .filter(select)
                .collect(Collectors.toList());
        
        List<Person> selecetedPerson2 = new ArrayList<>();
        
        for (Person person : persons) {
            if(person.getAge()>=25){
                selecetedPerson2.add(person);
            }
        }
        
        for (Person person : selectedPerson) {
            System.out.println("===================");
            System.out.println("Nama : " + person.getName());
            System.out.println("Umur : " + person.getAge());
            System.out.println("Kota : " + person.getCity());
        }
    }
}
