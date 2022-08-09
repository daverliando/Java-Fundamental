/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series1;

/**
 *
 * @author DevidBa
 */
public class K_MethodExample {

    static int sum(int[] arrAlias) {
        int result = 0;
        for (int x : arrAlias) {
            result+=x;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 1, 3, 4};
        int[] arr2 = {4, 1, 22, 6, 9, 2, 13, 15};
        
//        Code v1
//        int result = 0;
//        for (int i : arr) {
//            result += i;
//        }
//        System.out.println(result);

//        Code v2
        System.out.println(sum(arr));
        System.out.println(sum(arr2));
    }
}
