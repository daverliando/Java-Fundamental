/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author DevidBa
 */
public class Example02b {

    public static void main(String[] args) {
        List<Person> persons = Data.getData();

//        SELECT FROM PERSON WHERE AGE >= 25
        persons.stream() //convert to stream
                .filter(p -> p.getAge() >= 25) //operation
                .forEach(p -> System.out.println(p));   //print

        Stream<Person> s = persons.stream();

        Predicate<Person> select
                = p -> p.getAge() >= 25;

//        persons.stream()
//                .filter(p -> p.getCity().startsWith("P"))
//                .filter(p -> p.getCity().charAt(0)=='P')
//                .filter(p -> p.getCity().substring(0, 1).equals("P"))
        s //Substitution s = persons.stream()
                .filter(p -> p.getCity().contains("a"))
                .filter(select) //Substitution
                .forEach(x -> System.out.println(x));

//        Save to List
        List<Person> selectedPerson = persons.stream()
                .filter(p -> p.getAge() >= 25 && p.getCity().contains("a"))
                .collect(Collectors.toList());
 
        selectedPerson.forEach(System.out::println);
    }
}
