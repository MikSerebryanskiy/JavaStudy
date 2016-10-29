/**
 * Created by Depo on 23.10.2016.
 */
public class Parallelogram {
    public static void main (String[] args) {
        int a, b, h;
        a = 10;
        b = 20;
        h = 5;
        int perimetr = Perimetr (a, b);
        int square = Square (a, h);
        System.out.println ("Периметр параллелограмма равен " + perimetr + " cm.");
        System.out.println ("Площадь параллелограмма равна " + square + " cm.");
    }

    public static int Perimetr (int a1, int b1) {
        int Per = 2 * (a1 + b1);
        return Per;
    }

    public static int Square (int a2, int h2) {
        int Squ = a2 * h2;
        return Squ;
    }
}
