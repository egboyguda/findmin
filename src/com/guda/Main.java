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
        System.out.println("the lowest element on the array "+findMin(array));

    }
    public static int findMin(int[] array){
        int j= array[0];
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
            if(array[i]<j){
                j=+array[i];
            }
        }
        return j;
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
}
