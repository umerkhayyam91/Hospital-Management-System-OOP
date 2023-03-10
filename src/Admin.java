import java.util.Scanner;

public class Admin extends Person {
    static Scanner input = new Scanner(System.in);

    private String designation;
    private String department;

    public Admin(String designation, String department) {
        this.designation = designation;
        this.department = department;
    }

    public Admin(String id, String name, double age, String gender, String designation, String department) {
        super(id, name, age, gender);
        this.designation = designation;
        this.department = department;
    }

    public static void addDoctor() {
        System.out.println("Enter doctor ID: ");
        String id = input.next();
        System.out.println("Enter name of doctor: ");
        String docName = input.next();
        System.out.println("Enter doctor gender: ");
        String gender = input.next();
        System.out.println("Enter doctor age: ");
        double docAge = input.nextDouble();
        System.out.println("Enter doctor designation: ");
        String docDesignation = input.next();
        System.out.println("Enter doctor experience: ");
        double experience = input.nextDouble();
        String[] specializations = new String[3];
        System.out.println("Enter doctor specializations: ");
        for (int i = 0; i <= specializations.length; i++) {
            String spec = input.nextLine();

            specializations[i] = spec;
        }

        for (int i = 0; i < Runner.doctors.length; i++) {
            if (Runner.doctors[i] == null) {
                Doctor doc = new Doctor(id, docName, docAge, gender, docDesignation, experience, specializations,
                        new Appointment[3]);
                Runner.doctors[i] = doc;
                System.out.println("--> Doctor Details <--");
                System.out.println("doctor ID: " + id + "\ndoctor name:" + docName + "\ndoctor age: " + docAge
                        + "\ndoctor gender: "
                        + gender + "\ndoctor designation:" + docDesignation + "\ndoctor experience: " + experience
                        + "\ndoctor specializations: ");
                for (i = 0; i <= specializations.length; i++) {
                    System.out.println(specializations[i]);
                }
                System.out.println("Doctor Added Successfully!!");
                break;
            }
        }

    }

    public static void addPatient() {
        System.out.println("Enter patient ID: ");
        String id = input.next();
        System.out.println("Enter name of patient: ");
        String patName = input.next();
        System.out.println("Enter patient age: ");
        double patAge = input.nextDouble();
        System.out.println("Enter patient gender: ");
        String gender = input.next();

        System.out.println("Enter patient's dateOfBirth: ");
        String dateOfBirth = input.next();
        System.out.println("Enter patient martialStatus: ");
        String martialStatus = input.next();
        System.out.println("Enter patient pastDiseases: ");
        String[] pastDiseases = new String[3];

        for (int i = 0; i <= pastDiseases.length; i++) {
            String spec = input.nextLine();
            pastDiseases[i] = spec;
        }

        for (int i = 0; i < Runner.patients.length; i++) {
            if (Runner.patients[i] == null) {
                Patient pat = new Patient(id, patName, patAge, gender, dateOfBirth, martialStatus, pastDiseases, null);
                Runner.patients[i] = pat;
                System.out.println("--> patient Details <--");
                System.out.println("patient ID: " + id + "\npatient name:" + patName + "\npatient age: " + patAge
                        + "\npatient gender: "
                        + gender + "\npatient's dateOfBirth:" + dateOfBirth + "\npatient's martialStatus: " + martialStatus
                        + "\npatient's pastDiseases: ");
                for (i = 0; i <= pastDiseases.length; i++) {
                    System.out.println(pastDiseases[i]);
                }
                System.out.println("patient Added Successfully!!");
                break;
            }
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
