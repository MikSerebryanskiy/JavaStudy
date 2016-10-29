/**
 * Created by Depo on 23.10.2016.
 */
public class Quadrilateral {
    public static void main (String[] args) {
        int a;
        a = 10;
        int perimetr = Perimetr (a);
        int square = Square (a);
        System.out.println ("Периметр квадрата равен " + perimetr + " cm.");
        System.out.println ("Площадь квадрата равна " + square + " cm.");
    }

    public static int Perimetr (int a1) {
        int Per = a1 * 4;
        return Per;
    }

    public static int Square (int a2) {
        int Squ = a2 * a2;
        return Squ;
    }
}
