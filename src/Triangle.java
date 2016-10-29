/**
 * Created by Depo on 23.10.2016.
 */
public class Triangle {
    public static void main (String[] args) {
        int a, b, c;
        a = 10;
        b = 10;
        c = 20;
        int perimetr = Perimetr (a, b, c);
        int square = Square (a, b, c);
        System.out.println ("Периметр треугольника равен " + perimetr + " cm.");
        System.out.println ("Площадь треугольника равна " + square + " cm.");
    }

    public static int Perimetr (int a1, int b1, int c1) {
        int Per = a1 + b1 + c1;
        return Per;
    }

    public static int Square (int a2, int b2, int c2) {
        int p = (a2 + b2 + c2);
        int Squ = (int) Math.sqrt(p * (p - a2) * (p - b2) * (p - c2));
        return Squ;
    }
}
