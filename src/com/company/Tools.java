package com.company;

import java.util.Random;

public class Tools {

    public static int [] fill_array_random_number(int[] arr, int start, int end) {
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(end - start) + start;
        }
        return arr;
    }

    public static void print_array (int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr [i] + ", ");
        }
        System.out.println();
    }
}
