package com.company;

import java.util.Scanner;

import static com.company.Tools.*;

public class Task_5 {

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
        System.out.println("Сумма элементов с нечетыми индексами равна: " + sum_of_odd_index(one_dim_array));

    }

    public static int sum_of_odd_index(int [] arr) {
        int odd_sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 != 0){
                odd_sum += arr [i];
            }
        }
        return odd_sum;
    }
}
