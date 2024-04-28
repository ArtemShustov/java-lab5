import java.util.Scanner;

public class Task2 {
    // Вариант 23. Задание 2
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        var x1 = scaner.nextDouble();
        System.out.print("Enter y1: ");
        var y1 = scaner.nextDouble();
        System.out.print("Enter r1: ");
        var r1 = scaner.nextDouble();

        System.out.print("Enter x2: ");
        var x2 = scaner.nextDouble();
        System.out.print("Enter y2: ");
        var y2 = scaner.nextDouble();
        System.out.print("Enter r2: ");
        var r2 = scaner.nextDouble();

        var dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) - (r1 + r2);
        System.out.println("Dist: " + dist);
    }

}
