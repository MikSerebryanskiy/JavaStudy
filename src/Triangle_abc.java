import java.util.Scanner;

/**
 * Created by Depo on 29.10.2016.
 */
public class Triangle_abc {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первой стороны");
        int a = sc.nextInt();
        System.out.println("Введите длину второй стороны");
        int b = sc.nextInt();
        System.out.println("Введите длину третьей стороны");
        int c = sc.nextInt();
        String s = Result (a, b, c);
        System.out.println(s);
    }

    private static String Result(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            return "Треугольник построен";
        }
        else {
            return "Треугольник не построен";
        }
    }
}
