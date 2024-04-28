import java.util.Scanner;

public class Task7 {
    // Вариант 23. Задание 7
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var x = 0d;
        while (true) {
            System.out.print("Enter some number [-4, 4]: ");
            x = scaner.nextDouble();
            if (x <= 4 && x >= -4) {
                break;
            }
            System.out.println("Wrong number!");
        }
        System.out.println("G = " + G(x));
        System.out.println("z = " + Z(x));
    }
    public static double G(double x) {
        if (x <= 0) {
            return (3 + Math.sin(x)) / (1 + x * x);
        } else {
            return 2 * x * x * Math.pow(Math.cos(x), 2);
        }
    }
    public static double Z(double x) {
        if (x < 0) {
            return Math.pow(Math.abs(x), 1/3);
        } else if (x >= 0 && x < 1) {
            return -2 * x + x / (1 + x);
        } else {
            return Math.abs(3 - x) / (1 + x);
        }
    }
}
