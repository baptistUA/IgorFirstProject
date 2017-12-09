package meetings.lesson_01;

import java.util.Scanner;

import static java.lang.Math.*;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X_1;
        int X_2;
        int Y_1;
        int Y_2;

        double result_0;

        System.out.print("Please enter first variable X1: ");
        X_1 = scanner.nextInt();
        System.out.print("Please enter second variable X2: ");
        X_2 = scanner.nextInt();
        System.out.print("Please enter first variable Y1: ");
        Y_1 = scanner.nextInt();
        System.out.print("Please enter second variable Y2: ");
        Y_2 = scanner.nextInt();

        result_0 = sqrt(pow((X_1 - X_2),2)+pow((Y_1 - Y_2),2));

        System.out.println("d = " + result_0 );
        System.out.println ("Its Ok ;)?");
    }
}
