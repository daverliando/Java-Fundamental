/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series3.a_generics;

/**
 *
 * @author DevidBa
 */
public class Example02 {
    public static void main(String[] args) {
        CacheString myMessage = new CacheString();
        CacheInteger myNumber = new CacheInteger();
        CachePerson person = new CachePerson();
        
        //Generics
        CacheAny<String> myGenericMessage = new CacheAny<>();
        CacheAny<Integer> myGenericInteger = new CacheAny<>();
        CacheAny<Person> genericPerson = new CacheAny<>();
        
        myMessage.add("Do something");
        //Generics
        myGenericMessage.add("Do something");
        myGenericInteger.add(99);
        
        System.out.println(myMessage.get());
        //Generics
        System.out.println(myGenericMessage.get());
        System.out.println(myGenericInteger.get());
    }
}