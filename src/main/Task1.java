package main;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Дан массив из чисел, надо посчитать сумму всех не дублирующихся чисел в этом массиве
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, 7, 10, 3, 2, 7, 4, 8, 5, 9, 10};
        Set<Integer> numberSet = Arrays.stream(array).parallel().boxed().collect(Collectors.toSet());
     System.out.println(numberSet.parallelStream().reduce((x, y) -> x + y).get());

    }
}