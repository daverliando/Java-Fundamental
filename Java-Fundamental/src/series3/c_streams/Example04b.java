/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DevidBa
 */
public class Example04b {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("geeks", "cfd", "wkwk",
                "food", "tea", "done", "ho");

        List<Integer> integers = strings.stream()
                .map(m -> m.length())
                .collect(Collectors.toList());  //List<String> -> List<Integer>

        List<Person> persons = Data.getData();
        List<NewPerson> newPersons = persons.stream()
                .map(p -> new NewPerson(p.getAge() > 20, p.getName(), p.getPhone(), p.getCity(), p.getAge()))
                .collect(Collectors.toList());  //List<Person> -> List<NewPerson>
    }
}
