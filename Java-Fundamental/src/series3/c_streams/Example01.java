/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author DevidBa
 */
public class Example01 {

    public static void main(String[] args) {
        List<Person> persons = Data.getData();

        //For Loop
        System.out.println("For Loop");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

        //Enhanced For Loop
        System.out.println("Enhanced For Loop");
        for (Person p : persons) {
            System.out.println(p);
        }

        //Foreach
        System.out.println("Foreach");
        persons.forEach(p -> System.out.println(p));

        //Method Reference
        System.out.println("Foreach w/ method reference");
        persons.forEach(System.out::println);

//        Substitution persons.forEach(Consumer)
//        Consumer c = x -> System.out.println(x);
//        persons.forEach(c);
//        System.out.println("===================");

    }
}
