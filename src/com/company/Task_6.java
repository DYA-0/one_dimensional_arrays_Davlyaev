package com.company;

import java.util.Scanner;

import static com.company.Tools.*;

public class Task_6 {

    public static void main(String[] args) {

        System.out.println("Введите размер одномерного массива (длина): ");
        Scanner in = new Scanner(System.in);
        int length_of_array = in.nextInt();
        System.out.println("Введите интервал рандома через пробел: ");
        int start_random = in.nextInt();
        int end_random = in.nextInt();
        int[] one_dim_array = new int[length_of_array];
        one_dim_array = fill_array_random_number(one_dim_array, start_random, end_random);
        System.out.println("Текущий массив: ");
        print_array(one_dim_array);
        int [] reverse_one_dim_array = reverse_array(one_dim_array);
        System.out.println("Реверс массив: ");
        print_array(reverse_one_dim_array);

    }

    public static int[] reverse_array(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr [i];
            arr [i] = arr [arr.length - 1 - i];
            arr [arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
