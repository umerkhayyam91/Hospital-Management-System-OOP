import java.util.Scanner;

public class Patient extends Person {
    static Scanner input = new Scanner(System.in);

    private String dateOfBirth;
    private String martialStatus;
    private String[] pastDiseases;
    private Appointment[] appointments;

    public Patient() {
    }

    public Patient(String dateOfBirth, String martialStatus, String[] pastDiseases, Appointment[] appointments) {
        this.dateOfBirth = dateOfBirth;
        this.martialStatus = martialStatus;
        this.pastDiseases = pastDiseases;
        this.appointments = appointments;
    }

    public Patient(String id, String name, double age, String gender, String dateOfBirth, String martialStatus,
            String[] pastDiseases, Appointment[] appointments) {
        super(id, name, age, gender);
        this.dateOfBirth = dateOfBirth;
        this.martialStatus = martialStatus;
        this.pastDiseases = pastDiseases;
        this.appointments = appointments;
    }

    public static void bookAppointment() {
        System.out.print("Please enter your name: ");
        String patName = input.nextLine();
        int patIndex = searchPat(patName);
        while (patIndex == -1) {
            System.out.println("Patient not found! Please try again");
            System.out.print("Please enter the name of the patient: ");
            patName = input.nextLine();
            patIndex = searchPat(patName);
        }

        System.out.print("Please enter the name of the doctor: ");
        String docName = input.nextLine();
        int docIndex = searchDoctor(docName);
        while (docIndex == -1) {
            System.out.println("Doctor not found! Please try again");
            System.out.print("Please enter the name of the doctor: ");
            docName = input.nextLine();
            docIndex = searchDoctor(docName);
        }

        System.out.println("Enter time (HH:MM:a): ");
        String time = input.next();

        int patientAppointmentIndex = checkPatientBandwidth(patIndex);

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
        Appointment newAppointment = new Appointment(docIndex, patIndex, time, false);
        newAppointment.submitAppointment(doctorAppointmentIndex, patientAppointmentIndex);
    }

    public static int checkDoctorBandwidth(int docIndex) {
        Doctor doc = Runner.doctors[docIndex];

        Appointment[] appointments = doc.getAppointments();
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static int checkPatientBandwidth(int patIndex) {
        Patient pat = Runner.patients[patIndex];
        Appointment[] appointments = pat.getAppointments();
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public static int searchDoctor(String name) {
        for (int i = 0; i < Runner.doctors.length; i++) {
            Doctor doc = Runner.doctors[i];
            if (doc != null) {
                String docName = doc.getName();
                if (name.toLowerCase().equals(docName.toLowerCase())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int searchPat(String name) {
        for (int i = 0; i < Runner.patients.length; i++) {
            Patient pat = Runner.patients[i];
            if (pat != null) {
                String patName = pat.getName();
                if (name.toLowerCase().equals(patName.toLowerCase())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void seeAllAppointmentsPat() {
        boolean ifNull = true;

        System.out.print("Please enter your name: ");
        String name = input.next();
        int patIndex = searchPatient(name);
        while (patIndex == -1) {
            System.out.println("Patient not found! Please try again");
            System.out.print("Please enter the name of the patient (Press \"N\" for Main Menu): ");
            String newName = input.next();
            if (newName.equalsIgnoreCase("N")) {
                return;
            }
            patIndex = searchPatient(newName);

        }
        Patient pat = Runner.patients[patIndex];
        Appointment[] appointments = pat.getAppointments();
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i] != null) {
                int docIndex = appointments[i].getDoctorIndex();
                Doctor doc = Runner.doctors[docIndex];
                String docName = doc.getName();

                System.out.println("-->Here are your appointments<--");
                System.out.println("Doctor name: " + docName
                        + "\n" + "Patient name: "
                        + Runner.patients[patIndex].getName() + "\n" + "Time: " + appointments[i].getTime() + "\n"
                        + "Status: " + appointments[i].isStatus());
                ifNull = false;
            }
        }
        if (ifNull) {
            System.out.println("Appointment not found!!");
        }
    }

    public static int searchPatient(String name) {
        for (int i = 0; i < Runner.patients.length; i++) {
            Patient pat = Runner.patients[i];
            if (pat != null) {
                String patName = pat.getName();
                if (name.toLowerCase().equals(patName.toLowerCase())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String[] getPastDiseases() {
        return pastDiseases;
    }

    public void setPastDiseases(String[] pastDiseases) {
        this.pastDiseases = pastDiseases;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }
}
