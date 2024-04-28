import java.util.Scanner;

public class Task4 {
    // Вариант 23. Задание 4
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        System.out.print("Enter some number: ");
        var x = scaner.nextDouble();
        System.out.println(Func(x));
    }
    public static double Func(double x) {
        if (x == -4 ||  x == 2) {
            return Math.sqrt(2);
        }
        if (x < -4) {
            return Math.log10(Math.abs(10 * x));
        }
        if (x > -4 && x < 2) {
            return Math.log(Math.abs(x - 2 * x * x));
        }
        if (x > 2) {
            return Math.pow(Math.cos(x), Math.sin(x)) / Math.pow(x * x, 1 / 5);
        }
        return 0;
    }
}
