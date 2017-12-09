package meetings.lesson_01;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X_1;
        int X_2;
        int Y_1;
        int Y_2;

        double result_0;
        double result_1;
        double result_2;
        double result_3;
        double result_4;
        double result_5;

        System.out.print("Please enter first variable X1: ");
        X_1 = scanner.nextInt();
        System.out.print("Please enter second variable X2: ");
        X_2 = scanner.nextInt();
        System.out.print("Please enter first variable Y1: ");
        Y_1 = scanner.nextInt();
        System.out.print("Please enter second variable Y2: ");
        Y_2 = scanner.nextInt();

        result_1 = X_1 - X_2;
        result_2 = Y_1 - Y_2;
        result_3 = result_1 * result_1;
        result_4 = result_2 * result_2;
        result_5 = result_3 + result_4;
        result_0 = Math.sqrt(result_5);
        System.out.println("d = " + result_0 );
        System.out.println ("Its Ok ;)?");
    }
}
