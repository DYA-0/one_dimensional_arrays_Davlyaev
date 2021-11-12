package com.company;

import java.util.Scanner;

import static com.company.Tools.*;

public class Task_7 {

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
        System.out.println("\nКоличество нечетных элементов: " + count_odd_elements(one_dim_array));

    }

    public static int count_odd_elements(int [] arr) {
        int count_odd = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                count_odd++;
            }
        }
        return count_odd;
    }
}
