package com.codeChallenge;
import java.util.Arrays;


public class ArrayShift {
    public static void Main() {
       int[] inputArray = new int[]{2,3,4,6,7};
       int intNum = 8;
        ArrayShift(inputArray, intNum);


    }
    public static int[] ArrayShift(int[] orgArr,int intNum){
        int[] temp = new int[orgArr.length + 1 ];
        int midNum = intNum;
        int midIdx = Math.ceiling(orgArr.length/2);
        // can't use math.ceiling on integers, will need to convert to double to use this feature
        for(int i = 0; i < orgArr.length; i++){

            if(i < midIdx){
                temp[i]= orgArr[i];
            }
            else if(i == midIdx){
                temp[i]= midNum;

            }
            else if(i > midIdx){
                temp[i]= orgArr[i-1];
            }

        }

    return temp;
    }
}
