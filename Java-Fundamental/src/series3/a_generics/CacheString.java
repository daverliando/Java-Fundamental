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
public class CacheString {
    private String message;

    public String get() {
        return message;
    }

    public void add(String message) {
        this.message = message;
    }
}
