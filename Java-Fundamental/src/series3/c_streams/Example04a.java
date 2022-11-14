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
public class Example04a {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(3, 6, 9, 12, 15);
//        stream.map style v1
        ints.stream().map(as -> as * 3).forEach(System.out::println);
        
//        fore style v1
        for (Integer aInt : ints) {
            System.out.println(aInt * 3);
        }
        
//        stream.map style v2
        ints = ints.stream().map(as->as*3).collect(Collectors.toList());
        
//        fore style v2
        List<Integer> ints2 = new ArrayList<>();
        for (Integer aInt : ints) {
            ints.add(aInt*3);
        }
    }
}
