package com.guda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the length of array");
        int length = input.nextInt();
        int [] array = readIntegers(length);
        displayArr(array);
        reverseArr(array);
        findMin(array);
    }


    public static void findMin(int[] array){
        int j= array[0];
        for(int i=0; i<array.length;i++){
            if(array[i]<j){
                j=+array[i];
            }
        }
        System.out.println("the minimum value of element in array is "+j);
    }
    public static int[] readIntegers(int length){
        Scanner input = new Scanner(System.in);
        int [] array = new int[length];
        for (int i = 0;i<length;i++){
            System.out.println("please enter an element on the array:");
            array[i]=input.nextInt();
        }
        return  array;
    }
    public static void displayArr(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void reverseArr(int[] array){
            int length = array.length;
            int [] arr = new int[length];
            int count = 0;
            for (int i= length-1;i>=0;i--){
                arr[count] = array[i];
                count++;
            }
        System.out.println("reverse array "+Arrays.toString(arr));

    }
}
