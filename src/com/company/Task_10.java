package com.company;

import java.util.Scanner;

import static com.company.Tools.*;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Введите размер одномерного массива (длина): ");
        Scanner in = new Scanner(System.in);
        int length_of_array = in.nextInt();
        System.out.println("Введите интервал рандома через пробел: ");
        int start_random = in.nextInt();
        int end_random = in.nextInt();
        int[] one_dim_array = new int[length_of_array];
        fill_array_random_number(one_dim_array, start_random, end_random);
        System.out.println("Текущий массив: ");
        print_array(one_dim_array);
        ctrl_v_sort(one_dim_array);
        System.out.println("\nМассив, отсортированный по убыванию (сортировка вставками): ");
        print_array(one_dim_array);
    }

    public static void ctrl_v_sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i - 1;
            while (j >= 0 && arr[j] < arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }
}
