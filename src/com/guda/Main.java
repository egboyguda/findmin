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
