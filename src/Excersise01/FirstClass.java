package Excersise01;

import java.util.Scanner;

/**
 * Created by user on 21.10.2016. Первая программа.
 */
public class FirstClass {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину ");
        int x = sc.nextInt();
        if (sc.nextInt() <= 0) {
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Введите ширину ");
        int y = sc.nextInt();
        int s = Square (x, y); // вычисление площади прямоугольника
        int p = Perimetr (x, y); // вычисление периметра прямоугольника
        System.out.println("Площадь прямоугольника равна " + s + " см."); // вывод значения площади на экран
        System.out.println("Периметр прямоугольника равен " + p + " см."); // вывод значения периметра на экран
    }

    private static int Square(int x1, int y1) { // определение метода, вычисляющего площадь прямоугольника
        int area = x1 * y1; // вычисление площади прямоугольника
        return area;
    }

    private static int Perimetr(int p1, int r1) {
        int per = 2 * (p1 + r1);
        return per;
    }
}