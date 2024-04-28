import java.util.Scanner;

public class Task6 {
    // Вариант 23. Задание 6
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        System.out.print("Enter x: ");
        var x = scaner.nextDouble();
        System.out.print("Enter y: ");
        var y = scaner.nextDouble();

        var inArea = false;

        if (y > 0) {
            System.out.println("Point not in area.");
            return;
        }
        if (inCircle(0, 0, 6, x, y)) { // main
            inArea = true;
        }
        if (inCircle(2, -4, 1, x , y))  { // small empty
            inArea = false;
        }
        if (inCircle(-1, -3, 2, x, y)) { // 2, big empty
			inArea = inCircle(-1, -2, 1, x, y); // 3, in 2
        }
        if ((x >= -4) && (x <= -1) && (y > (x + 1)) && (y < 0) && (y > -3)) { // left tr
            inArea = false;
        }
        if ((x >= -1) && (x <= 4) && (y > (x * -0.75d - 0.75d)) && (y > (x * 3 - 12)) && (y < 0) && (y > -3)) {
            inArea = false;
        }

        if (inArea) {
            System.out.println("Point in area!");
        } else {
            System.out.println("Point not in area...");
        }
    }
    public static boolean inCircle(double circleX, double circleY, double r, double pointX, double pointY) {
        return Math.sqrt(Math.pow(circleX - pointX, 2) + Math.pow(circleY - pointY, 2)) <= r;
    }
}
