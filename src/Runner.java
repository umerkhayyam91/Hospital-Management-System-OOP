import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---->Welcome to Hospital Management System<----");
        System.out.println("Please select your user type");
        System.out.println("1. Doctor\n2. Patient\n3. Admin\n4. Exit");
        int value = 0;
        while (value < 1 || value > 4) {
            System.out.print("Enter from 1-4: ");
            value = input.nextInt();
            if (value < 1 || value > 4) {
                System.out.println("Value out of range, please enter from (1-4)");
            } else if (value == 1) {
                System.out.println("Value out of range, please enter from 1");

            } else if (value == 2) {
                System.out.println("Value out of range, please enter from 2");

            } else if (value == 3) {
                System.out.println("Value out of range, please enter from 3");

            } else if (value == 4) {
                System.out.println("Program Exited");
                break;
            }

        }

    }

}
