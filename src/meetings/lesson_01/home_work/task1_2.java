package meetings.lesson_01.home_work;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a;
            int b;
            int c;
            int p;
            int t = 2;

            double result_0;
            double result_1;
            double result_2;
            double result_3;
            double result_4;
            double result_5;

            System.out.print("Please enter  variable a: ");
            a = scanner.nextInt();
            System.out.print("Please enter  variable b: ");
            b = scanner.nextInt();
            System.out.print("Please enter  variable c: ");
            c = scanner.nextInt();
            System.out.print("Please enter  variable p: ");
            p = scanner.nextInt();

            result_1 = a + b;
            result_2 = t / result_1;
            result_3 = p - 8;
            result_4 = a * c * p * result_3;
            result_5 = Math.sqrt(result_4);
            result_0 = result_5 * result_2;
            System.out.println("W = " + result_0 );
            System.out.println ("Its Ok ;)?");
        }
}

