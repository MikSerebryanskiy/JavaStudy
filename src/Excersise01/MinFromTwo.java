package Excersise01;

import java.util.Scanner;

/**
 * Created by user on 26.10.2016.
 */
public class MinFromTwo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите первое число");
        int x = sc.nextInt();
        System.out.println ("Введите второе число");
        int y = sc.nextInt();
        if (x > y) {
            System.out.println (y + " - наименьшее число.");
        }
        else if (x < y) {
            System.out.println (x + " - наименьшее число.");
        }
        else {
            System.out.println ("Числа равны.");
        }
    }
}
