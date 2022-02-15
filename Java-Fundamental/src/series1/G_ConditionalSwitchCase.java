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
public class G_ConditionalSwitchCase {
    public static void main(String[] args) {
        int pilihan = 1;
        switch(pilihan){
            case 1 : {
                System.out.println("pilihan 1");
                break;
            }
            case 2 : {
                System.out.println("pilihan 2");
                break;
            }
            case 3 : {
                System.out.println("pilihan 3");
                break;
            }
            default : System.out.println("Ini nilai default");
        }
    }
}
