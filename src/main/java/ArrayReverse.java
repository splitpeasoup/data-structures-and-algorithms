package com.codeChallenge;
import java.util.Arrays;


public class ArrayReverse {
    public static void Main() {

        ArrayReverse();


    }
    public static int[] ArrayReverse(int[] a){


        
        for(int i = 0; i < array.length/2; i++){

           int temp = array[i];
           array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }

        return array;
    }
}