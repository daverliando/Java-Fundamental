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
public class CacheAny <T> {
    private T t;

    public T get() {
        return t;
    }

    public void add(T t) {
        this.t = t;
    }
}
