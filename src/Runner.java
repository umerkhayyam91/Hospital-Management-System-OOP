import java.util.Scanner;

public class Runner {
    static Scanner input = new Scanner(System.in);
    static Doctor[] doctors = new Doctor[5];
    static Patient[] patients = new Patient[5];
    static Admin[] admin = new Admin[5];

    public static void main(String[] args) {

        // Doctors
        String[] specializations = new String[5];
        doctors[0] = new Doctor("d001", "Dr1", 29, "M", "GP", 10, specializations, new Appointment[3]);
        doctors[1] = new Doctor("d002", "Dr2", 25, "F", "Gyane", 7, specializations, new Appointment[3]);
        doctors[2] = new Doctor("d003", "Dr3", 21, "F", "Dentist", 5, specializations, new Appointment[3]);

        // Patient
        String[] pastDisease = new String[5];
        patients[0] = new Patient("p001", "H", 25, "male", "8/01/1998", "single", pastDisease, new Appointment[3]);
        patients[1] = new Patient("p002", "Ahmad Ali", 23, "male", "20/01/1998", "single", pastDisease,
                new Appointment[3]);

        // Admins
        Admin[] admin = new Admin[5];
        admin[0] = new Admin("a001", "Asghar Abbass", 50, "male", "admin Chief", "Admin Branch");
        admin[0] = new Admin("a002", "Iftikhar Ali", 57, "male", "admin Staff", "Admin Branch");

        int value = 0;
        while (value != 4) {
            System.out.println("---->Welcome to Hospital Management System<----");
            System.out.println("Please select your user type");
            System.out.println("1. Doctor\n2. Patient\n3. Admin\n4. Exit");

            System.out.print("Enter from 1-4: ");
            value = input.nextInt();

            if (value == 1) {
                doctorMenu();
            } else if (value == 2) {
                patientMenu();
            } else if (value == 3) {
                adminMenu();
            } else if (value != 4) {
                System.out.println("Value out of range, please enter from (1-4)");

            }
        }

        System.out.println("Good bye!");
    }

    public static void patientMenu() {

        int y = 0;
        while (y != 3) {
            System.out.println("\n---->Patient's Menu<----");
            System.out.println("Please select from the following menu");
            System.out.println("1. Book an appointment\n2. See all appointments\n3. Exit");
            System.out.print("Enter from 1-3: ");
            y = input.nextInt();
            if (y == 1) {
                Patient.bookAppointment();
            } else if (y == 2) {
                Patient.seeAllAppointmentsPat();
            } else if (y != 3) {
                System.out.println("Value out of range, please enter from (1-3)");
            }

        }
        System.out.println("Exiting patient's menu!!\n1");

    }

    public static void doctorMenu() {

        int z = 0;
        while (z != 5) {
            System.out.println("---->Doctor's Menu<----");
            System.out.println("Please select from the following menu");
            System.out.println(
                    "1. See all appointments\n2. Accept appointments\n3. Reject appointments\n4. Delete appointments \n5. Exit");
            System.out.print("Enter from 1-5: ");
            z = input.nextInt();
            if (z == 1) {
                Doctor.seeAllAppointmentsDoc();
            } else if (z == 2) {

            } else if (z == 3) {

            } else if (z == 4) {

            } else if (z != 5) {
                System.out.println("Value out of range, please enter from (1-5)");
            }
        }
        System.out.println("Exiting Doctor's menu!!\n");
    }

    public static void adminMenu() {

        int x = 0;
        while (x != 7) {
            System.out.println("\n---->Admin's Menu<----");
            System.out.println("Please select from the following menu");
            System.out.println(
                    "1. Add doctor\n2. Add patient\n3. Edit doctor\n4. Edit patient\n5. Delete patient\n6. Delete patient\n7. Exit");
            System.out.print("Enter from 1-7: ");
            x = input.nextInt();
            if (x == 1) {

            } else if (x == 2) {

            } else if (x == 3) {

            } else if (x == 4) {

            } else if (x == 5) {

            } else if (x == 6) {

            } else if (x != 7) {

                System.out.println("Value out of range, please enter from (1-7)");

            }
        }
        System.out.println("Exiting admin's menu!!\n");
    }
}
