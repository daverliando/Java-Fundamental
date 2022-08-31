/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

import java.util.List;

/**
 *
 * @author DevidBa
 */
public class Example02a {

    public static void main(String[] args) {
        List<Person> persons = Data.getData();

//        STREAM VERSION
        persons.stream()                                //convert to stream
                .filter(p -> p.getAge() >= 25)          //operation
                .forEach(p -> System.out.println(p));   //print

//        FORLOOP VERSION
        for (Person p : persons) {
            if(p.getAge()>=25){
                System.out.println(p);
            }
        }
    }
}
