/**
 * Created by Depo on 23.10.2016.
 */
public class Rhombus {
    public static void main (String[] args) {
        int a, h;
        a = 10;
        h = 7;
        int perimetr = Perimetr (a);
        int square = Parallelogram.Square (a, h);
        System.out.println ("Периметр ромба равен " + perimetr + " cm.");
        System.out.println ("Площадь ромба равна " + square + " cm.");
    }

    public static int Perimetr (int a1) {
        int Per = 4 * a1;
        return Per;
    }
}
