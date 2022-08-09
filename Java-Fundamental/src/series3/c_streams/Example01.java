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
        
        //For Loop
//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
        
        //Enhanced For Loop
//        for (Person p : persons) {
//            System.out.println(p);
//        }
        
        //Foreach
//        persons.forEach(p -> System.out.println(p));
        
        //Method Reference
//        persons.forEach(System.out::println);
        
//        Consumer c = x -> System.out.println(x);
//        persons.forEach(c);
//        System.out.println("===================");
//

//        Stream<Person> s = persons.stream();
        
//      WHERE age >= 25
        persons.stream()
//                .filter(p -> p.getCity().startsWith("P"))
//                .filter(p -> p.getCity().charAt(0)=='P')
                .filter(p -> p.getCity().substring(0, 1).equals("P"))
                .forEach(x -> System.out.println(x));
        
//        Save to List
//        System.out.println("===================");
//
        Predicate<Person> select
                = p -> p.getAge() > 21 && p.getCity().contains("a");

        
//        Stream Filter Version
        List<Person> selectedPerson = persons.stream()
                .filter(p -> p.getAge() > 21 && p.getCity().contains("a"))
                .collect(Collectors.toList());
        
//        List<Person> selecetedPerson2 = new ArrayList<>();
        
//        for (Person person : persons) {
//            if(person.getAge()>=25){
//                selecetedPerson2.add(person);
//            }
//        }
//        
//        for (Person person : selectedPerson) {
//            System.out.println("===================");
//            System.out.println("Nama : " + person.getName());
//            System.out.println("Umur : " + person.getAge());
//            System.out.println("Kota : " + person.getCity());
//        }
    }
}
