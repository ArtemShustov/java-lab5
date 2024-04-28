import java.util.Scanner;

public class Task5 {
    // Вариант 23. Задание 5
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        System.out.print("Enter x: ");
        var x = scaner.nextDouble();
        System.out.print("Enter y: ");
        var y = scaner.nextDouble();

        var inArea = -1;

        if ((x <= 2 && x >= -2) || (y <= 4 && y >= 2)) { // area 1
            inArea = 1;
        }
        if ((x <= -1) && inCircle(-1, 3, 2, x, y)) {
            inArea = 1;
        }
        if (inShit1(x, y)) {
            inArea = 1;
        }

        if ((x <= 6 && x >= 4) || (y <= 0 && y >= -1)) { // area 2
            inArea = 2;
        }
        if ((y <= 0) && inCircle(5, 0, 2, x, y)) {
            inArea = 2;
        }
        if (inShit2(x, y)) {
            inArea = 2;
        }
        if (inArea == 2 || inArea == 1) {
            System.out.println("Point in area " + inArea);
        } else {
            System.out.println("Out of bounds!");
        }
    }
    public static boolean inCircle(double circleX, double circleY, double r, double pointX, double pointY) {
        return Math.sqrt(Math.pow(circleX - pointX, 2) + Math.pow(circleY - pointY, 2)) <= r;
    }
    public static boolean inShit1(double pointX, double pointY) {
        return ( (pointY >= (1/3d * pointX + 4/3d)) && (pointX >= -1 && pointX <= 2) && (pointY >= 1 && pointY <= 2) )
                || ( (pointY >= (pointX * 2 - 2)) && (pointX <= 3 && pointX >= 2) && (pointY <= 4 && pointY >= 2) )
                || ( (pointY <= (pointX * -0.25 + 4.75)) && (pointX >= -1 && pointX <= 3) && (pointY >= 4 && pointY <= 5) );
    }
    public static boolean inShit2(double pointX, double pointY) {
        return (pointY <= -0.2d * pointX + 1.4d) // big line
            && (pointY >= 0) // down border
            && (pointX >= 2 && pointX <= 7) // in x area
            && (pointY >= (-1 * pointX + 3)) // small line
            && (pointY <= 1); // up border
    }
}
