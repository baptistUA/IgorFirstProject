package meetings.lesson_02;

import java.util.Scanner;

public class Lesson_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String bloodGroup;

        String personalInfo;

        System.out.print("Please enter your name: ");
        name = sc.next();

        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        System.out.print("Please enter your blood group: ");
        bloodGroup = sc.next();

        personalInfo = "Your name: "+ name+"\nYour age: " + age+"\n Your blood group: "+bloodGroup;


        System.out.println(personalInfo);








        //System.out.println("Hi "+name);
    }
}
