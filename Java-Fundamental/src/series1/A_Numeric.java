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
public class A_Numeric {
//https://www.baeldung.com/scala/type-hierarchies
//https://www.scientecheasy.com/2021/02/java-number-class.html/
//        byte - short - int -  long - float - double
    Long coba;
    static byte byte2 = 5;
    static short short2 = 5;
    static int integer2 = 5;
    static long long2 = 5L;
    static float float2 = 5.17f;
    static double double2 = 5.10;

    public static void toDouble() {
//        byte - short - int -  long - float - DOUBLE
        double toDouble;
        toDouble = byte2;
        toDouble = integer2;
        toDouble = short2;
        toDouble = float2;
        toDouble = long2;
        toDouble = double2;
    }
    
    public static void toFloat() {
//        byte - short - int -  long - FLOAT - double
        float toFloat;
        toFloat = byte2;
        toFloat = short2;
        toFloat = integer2;
        toFloat = long2;
        toFloat = float2;
        toFloat = double2; //Convert double to float
    }

    public static void toLong() {
//        byte - short - int -  LONG - float - double
        long toLong;
        toLong = byte2;
        toLong = short2;
        toLong = integer2;
        toLong = long2;
        toLong = Long.float2;  //Convert float to long
        toLong = double2; //Convert double to long
    }
    
    public static void toInt() {
//        byte - short - INT -  long - float - double
        int toInt;
        toInt = byte2;
        toInt = short2;
        toInt = integer2;
        toInt = long2;      //Convert long to int
        toInt = float2;     //Convert float to int
        toInt = double2;    //Convert double to int
    }
    
    public static void toShort() {
//        byte - SHORT - int -  long - float - double
        short toShort;
        toShort = byte2;
        toShort = short2;
        toShort = integer2; //Convert int to short
        toShort = long2;    //Convert long to short
        toShort = float2;   //Convert float to short
        toShort = double2;  //Convert double to short
    }
    
    public static void toByte() {
//        BYTE - short - int -  long - float - double
        byte toByte;
        toByte = byte2;
        toByte = short2;    //Convert short to byte
        toByte = integer2;  //Convert int to byte
        toByte = long2;     //Convert long to byte
        toByte = float2;    //Convert float to byte
        toByte = double2;   //Convert double to byte
    }

    
    
    public static void testConvert() {
        long l1 = 500L; //int to Long -> 500L
        long l2 = 500;  //int to Long -> 500
        long l3 = Long.valueOf(500);  //int to Long -> 500

//        int i2 = l1;    //possible lossy conversion
        int i1 = 500;
        int i2 = (int) l1;//convert with casting
        int i3 = Integer.parseInt(l1 + ""); //convert with parsing
    }

    public static void main(String[] args) {

    }
}
