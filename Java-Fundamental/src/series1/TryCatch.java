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
public class TryCatch {
    public static void main(String[] args) {
        try {
            int x = 9 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
