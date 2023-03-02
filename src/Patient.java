public class Patient extends Person {
    private String dateOfBirth;
    private String martialStatus;
    private String[] pastDiseases;
    private Appointment[] appointments;

    public Patient() {}

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
