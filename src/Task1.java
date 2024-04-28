import java.util.Scanner;

public class Task1 {
    // Вариант 23. Задание 1
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        var x = scaner.nextInt();
        var y = scaner.nextInt();
        var z = scaner.nextInt();
        System.out.println("Max: " + FindMax(x, y, z));
    }
    public static int FindMax(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        if (y > z && y > x) {
            return y;
        }
        if (z > x && z > y) {
            return z;
        }
        return 0;
    }
}
