package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("Введите размер одномерного массива (длина): ");
        Scanner in = new Scanner(System.in);
        int length_of_array = in.nextInt();
        System.out.println("Введите интервал рандома через пробел: ");
        int start_random = in.nextInt();
        int end_random = in.nextInt();
        int [] one_dim_array = new int[length_of_array];
        one_dim_array = fill_array_random_number(one_dim_array, start_random, end_random);
        System.out.println("Текущий массив: ");
        print_array(one_dim_array);
        int maximum_value = search_max_in_array(one_dim_array);
        System.out.println("Максимальный элемент массива равен: " + maximum_value);

    }

    public static int search_max_in_array (int [] arr ) {
        int max = arr [0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr [i]){
                max = arr [i];
            }
        }
        return max;
    }

}
