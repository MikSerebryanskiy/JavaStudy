package Excersise01;

import java.util.Scanner;

/**
 * Created by user on 26.10.2016.
 */
public class MaxMinAverageFromThreeOtherMethod {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        System.out.println("Введите третье число");
        int z = sc.nextInt();
        int max = maximum (x, y, z);
        System.out.println(max + " - наибольшее число.");
        int min = minimum (x, y, z);
        System.out.println(min + " - наименьшее число.");
        int ave = averageValue (x, y, z);
        System.out.println(ave + " - среднее число.");
    }

    private static int maximum (int x, int y, int z){
        if (x > y && x > z){
            return x;
        }
        else if (y > x && y > z){
            return y;
        }
        else {
            return z;
        }
    }

    private static int minimum (int x, int y, int z){
        if (x < y && x < z){
            return x;
        }
        else if (y < x && y < z) {
            return y;
        }
        else {
            return z;
        }
    }

    private static int averageValue (int x, int y, int z){
        if (x < y && y < z){
            return y;
        }
        else if (y < x && x < z){
            return x;
        }
        else {
            return z;
        }
    }
}