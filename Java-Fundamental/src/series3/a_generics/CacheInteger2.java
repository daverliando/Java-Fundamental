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
public class CacheInteger2<T> extends CacheAny<T> {
    
    Integer number;
    T[] test;
    
    public void tambah(int num) {
        this.number = num;
    }
}
