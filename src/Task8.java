import java.util.Scanner;

public class Task8 {
    // Вариант 23. Задание 8
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        System.out.println("Enter some number (<8):");
        var x = scaner.nextInt();
        var shit = Math.sqrt(0.5d);
        switch (x) {
            case 0:
                System.out.println(Math.round(shit * 10) / 10);
                break;
            case 1:
                System.out.println(String.format("%.1f", shit));
                break;
            case 2:
                System.out.println(String.format("%.2f", shit));
                break;
            case 3:
                System.out.println(String.format("%.3f", shit));
                break;
            case 4:
                System.out.println(String.format("%.4f", shit));
                break;
            case 5:
                System.out.println(String.format("%.5f", shit));
                break;
            case 6:
                System.out.println(String.format("%.6f", shit));
                break;
            case 7:
                System.out.println(String.format("%.7f", shit));
                break;
            case 8:
                System.out.println(String.format("%.8f", shit));
                break;
            default:
                System.out.println(String.format("%." + x + "f", shit));
        }
    }
}
