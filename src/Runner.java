import java.util.Scanner;

public class Runner {
    static Scanner input = new Scanner(System.in);
    static Doctor[] doctors = new Doctor[5];
    String[] specializations = new String[5];
    Appointment[] apointments = new Appointment[3];
    static Patient[] patients = new Patient[5];
    String[] pastDisease = new String[5];
    static Admin[] admin = new Admin[5];

    public static void main(String[] args) {

        // Doctors
        String[] specializations = new String[5];
        Appointment[] apointments = new Appointment[3];
        doctors[0] = new Doctor("d001", "Dr2", 29, "M", "GP", 10, specializations, apointments);
        doctors[1] = new Doctor("d002", "Dr. Ayesha Khayyam", 25, "F", "Gyane", 7, specializations, apointments);

        // Patient
        String[] pastDisease = new String[5];
        patients[0] = new Patient("p001", "Hamza Shakeel", 25, "male", "8/01/1998", "single", pastDisease, apointments);
        patients[1] = new Patient("d002", "Ahmad Ali", 23, "male", "20/01/1998", "single", pastDisease, apointments);

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
                while (y < 1 || y > 3) {
                    System.out.print("Enter from 1-3: ");
                    y = input.nextInt();
                    if (y < 1 || y > 3) {
                        System.out.println("Value out of range, please enter from (1-3)");
                    } else if (y == 1) {
                        bookAppointment();
                    } else if (y == 2) {
                        seeAllAppointments();
                    } else if (y == 3) {
                        break;
                    }
                }
            } else if (value == 3) {
                System.out.println("\n---->Admin's Menu<----");
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
                        break;
                    }
                }

            } else {
                System.out.println("Program Exited");
                break;
            }
        }

    }

    public static void bookAppointment() {
        System.out.print("Please enter the name of the doctor: ");
        String name = input.next();
        int docIndex = searchDoctor(name);
        while (docIndex == -1) {
            System.out.println("Doctor not found! Please try again");
            System.out.print("Please enter the name of the doctor: ");
            String newName = input.next();
            docIndex = searchDoctor(newName);
        }

        System.out.println("Enter time (HH:MM:a): ");
        String time = input.next();

        int patientAppointmentIndex = checkPatientBandwidth();

        if (patientAppointmentIndex == -1) {
            System.out.println("You do not have enought bandwidth!");
            return;
        }

        int doctorAppointmentIndex = checkDoctorBandwidth(docIndex);

        if (doctorAppointmentIndex == -1) {
            System.out.println("Doctor do not have enought bandwidth!");
            return;
        }

        // submit appointment
        Appointment newAppointment = new Appointment(docIndex, 0, time, false);
        newAppointment.submitAppointment(doctors, patients, doctorAppointmentIndex, patientAppointmentIndex);
    }

    public static int checkDoctorBandwidth(int docIndex) {
        Doctor doc = doctors[docIndex];

        Appointment[] appointments = doc.getAppointments();
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public static int checkPatientBandwidth() {
        Patient pat = patients[0];
        Appointment[] appointments = pat.getAppointments();
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public static int searchDoctor(String name) {
        for (int i = 0; i < doctors.length; i++) {
            Doctor doc = doctors[i];
            if (doc != null) {
                String docName = doc.getName();
                if (name.toLowerCase().compareToIgnoreCase(docName.toLowerCase()) == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void seeAllAppointments() {
        System.out.print("Please enter your name: ");
        String name = input.next();
        int patIndex = searchPatient(name);
        while (patIndex == -1) {
            System.out.println("Patient not found! Please try again");
            System.out.print("Please enter the name of the patient: ");
            String newName = input.next();
            patIndex = searchPatient(newName);
        }
        Patient pat = patients[patIndex];
        Appointment[] appointments = pat.getAppointments();
        for (int i = 0; i < appointments.length; i++) {
            System.out.println(appointments[i]);
        }
    }

    public static int searchPatient(String name) {
        for (int i = 0; i < patients.length; i++) {
            Patient pat = patients[i];
            String patName = pat.getName();
            if (name == patName) {
                return i;
            }
        }
        return -1;
    }
}
