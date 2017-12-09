package meetings.lesson_01;

import java.util.Scanner;

public class Lesson_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//

        int firstVariable;
        //int secondVariable;
        double result;

        // primitive data types java

        System.out.print("Please enter first variable: ");
        firstVariable = scanner.nextInt();
        System.out.print("Please enter second variable: ");
        //secondVariable = scanner.nextInt();

        //result = Math.pow(firstVariable,secondVariable);
        result = Math.sqrt(firstVariable);

        // Math java tutorialspoint

        System.out.println("Result = "+result);
    }
}
