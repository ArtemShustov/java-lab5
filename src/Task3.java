import java.util.Scanner;

public class Task3 {
    // Вариант 23. Задание 3
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        for (var x = -3d; x <= 3; x += 0.5d) {
            System.out.println(x + " = " + Func(x));
        }
    }
    public static double Func(double x) {
        if (x >= 0) {
            return Math.sin(2 * x * Math.PI);
        } else {
            return 3 * Math.PI * x - Math.cos(2 * x * Math.PI);
        }
    }

}
