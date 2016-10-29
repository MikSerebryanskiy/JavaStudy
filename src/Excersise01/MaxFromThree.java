package Excersise01;

import java.util.Scanner;

/**
 * Created by user on 26.10.2016.
 */
public class MaxFromThree {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        System.out.println("Введите третье число");
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println(x + " - наибольшее число.");
        }
        else if (y > x && y > z) {
            System.out.println(y + " - наибольшее число.");
        }
        else if (z > x && z > y){
            System.out.println(z + " - наибольшее число.");
        }
        else if (x > z && y > z && x == y) {
            System.out.println("Первое и второе числа - наибольшие, они равны.");
        }
        else if (y > x && z > x && z == y) {
            System.out.println("Второе и третье числа - наибольшие, они равны.");
        }
        else if (x > y && z > y && z == x) {
            System.out.println("Первое и третье числа - наибольшие, они равны.");
        }
        else {
            System.out.println("Числа равны.");
        }
    }
}
