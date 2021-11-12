package com.company;

import java.util.Scanner;

import static com.company.Tools.*;

public class Task_9 {

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
        select_sort(one_dim_array);
        System.out.println("\nМассив, отсортированный по возрастанию (сортировка выбором): ");
        print_array(one_dim_array);
    }

    public static void select_sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int current_index = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[current_index]) {
                    current_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[current_index];
            arr[current_index] = temp;
        }
    }
}
