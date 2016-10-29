package Excersise01;

import java.util.Scanner;

/**
 * Created by user on 26.10.2016.
 */
public class EqualFromThreeOtherMethod {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        System.out.println("Введите третье число");
        int z = sc.nextInt();
        if (x != y && y != z && x != z) {
            int max = maximum(x, y, z);
            System.out.println(max + " - наибольшее число.");
            int min = minimum(x, y, z);
            System.out.println(min + " - наименьшее число.");
            int ave = averageValue(x, y, z);
            System.out.println(ave + " - среднее число.");
        }
        else {
            int mae = maxAndEqual (x, y, z);
            System.out.println(mae + " - наибольшее одинаковое число.");
        }
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
    private static int maxAndEqual (int x, int y, int z) {
        if (x > y && z > y && x == z) {
            return z;
        }
        else if (y > x && z > x && y == z) {
            return y;
        }
        else if (x > z && y > z && x == y) {
            return x;
        }
        return x;
    }
}
