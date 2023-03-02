import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Doctors
        Doctor[] doctors = new Doctor[5];
        String[] specs = new String[5];
        Appointment[] apps = new Appointment[3];
        doctors[0] = new Doctor("d001", "Dr. Umer Khayyam", 28, "M", specs, 12, "G.P", apps);
        doctors[1] = new Doctor("d002", "Dr. Ayesha Ali", 26, "F", specs, 12, "Gynea", apps);

        // Patient
        Patient[] patients = new Patient[5];
        String[] pastDisease = new String[5];
        patients[0] = new Patient("p001", "Hamza Shakeel", 25, "male", "8/01/1998", "single", pastDisease, apps);
        patients[1] = new Patient("d002", "Ahmad Ali", 23, "male", "20/01/1998", "single", pastDisease, apps);

        // Admins
        Admin[] admin = new Admin[5];
        admin[0] = new Admin("a001", "Asghar Abbass", 50, "male", "admin Chief", "Admin Branch");
        admin[0] = new Admin("a002", "Iftikhar Ali", 57, "male", "admin Staff", "Admin Branch");



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
                System.out.println("\n---->Doctor's Menu<----");
                System.out.println("Please select from the following menu");
                System.out.println(
                        "1. See all appointments\n2. Accept appointments\n3. Reject appointments\n4. Delete appointments \n5. Exit");
                int z = 0;
                while (z < 1 || z > 7) {
                    System.out.print("Enter from 1-5: ");
                    z = input.nextInt();
                    if (z < 1 || z > 7) {
                        System.out.println("Value out of range, please enter from (1-5)");
                    } else if (z == 1) {

                    } else if (z == 2) {

                    } else if (z == 3) {

                    } else if (z == 4) {

                    } else if (z == 5) {

                    }
                }
            } else if (value == 2) {
                System.out.println("\n---->Patient's Menu<----");
                System.out.println("Please select from the following menu");
                System.out.println("1. Book an appointment\n2. See all appointments\n3. Exit");
                int y = 0;
                while (y < 1 || y > 7) {
                    System.out.print("Enter from 1-3: ");
                    y = input.nextInt();
                    if (y < 1 || y > 7) {
                        System.out.println("Value out of range, please enter from (1-3)");
                    } else if (y == 1) {

                    } else if (y == 2) {

                    } else if (y == 3) {

                    }
                }
            } else if (value == 3) {
                System.out.println("\n---->Patient's Menu<----");
                System.out.println("Please select from the following menu");
                System.out.println(
                        "1. Add doctor\n2. Add patient\n3. Edit doctor\n4. Edit patient\n5. Delete patient\n6. Delete patient\n7. Exit");
                int x = 0;
                while (x < 1 || x > 7) {
                    System.out.print("Enter from 1-7: ");
                    x = input.nextInt();
                    if (x < 1 || x > 7) {
                        System.out.println("Value out of range, please enter from (1-7)");
                    } else if (x == 1) {

                    } else if (x == 2) {

                    } else if (x == 3) {

                    } else if (x == 4) {

                    } else if (x == 5) {

                    } else if (x == 6) {

                    } else if (x == 7) {

                    }
                }

            } else if (value == 4) {
                System.out.println("Program Exited");
                break;
            }

        }

    }

}
