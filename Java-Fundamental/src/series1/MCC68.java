/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series1;

import java.util.Arrays;

/**
 *
 * @author DevidBa
 */
public class MCC68 {
    
    static int getSum(int a, int b){
        return a+b;
    }
    
    static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 5, 2, 9, 12};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            sum+=arr[i];
//        }
        
        System.out.println(getSum(arr));
        
        
//        for (int i : arr) {
//            System.out.println(i);
//        }
    }
}