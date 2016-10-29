package Excersise01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 24.10.2016.
 */
public class SecondClass {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Введите ширину ");
        int y = Integer.parseInt(br.readLine());
        int s = Square (x, y); // вычисление площади прямоугольника
        int p = Perimetr (x, y); // вычисление периметра прямоугольника
        System.out.println("Площадь прямоугольника равна " + s + " см."); // вывод значения площади на экран
        System.out.println("Периметр прямоугольника равен " + p + " см."); // вывод значения периметра на экран
        br.close();
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