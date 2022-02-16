/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.c_streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author DevidBa
 */
public class Data {

    static List<Person> getData() {
        List<Person> persons = Arrays.asList(new Person[]{
            new Person("Dev", "0855720xxxxxxxx", "Cianjur", 22),
            new Person("Johan", "0855720xxxxxxxx", "Makasar", 21),
            new Person("Wahyu", "0855720xxxxxxxx", "Palembang", 21),
            new Person("Herul", "0855720xxxxxxxx", "Pontianak", 20),
            new Person("Nathan", "0855720xxxxxxxx", "Semarang", 20),
            new Person("Joko", "0855720xxxxxxxx", "Kudus", 30),
            new Person("Aji", "0855720xxxxxxxx", "Bekasi", 25)
        });
        return persons;
    }
}
