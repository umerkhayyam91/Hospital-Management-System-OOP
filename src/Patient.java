public class Patient {
    private String dateOfBirth;
    private String martialStatus;
    private String[] pastDiseases;
    private String[] appointments;

    public Patient(String dateOfBirth, String martialStatus, String[] pastDiseases, String[] appointments) {
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

    public String[] getAppointments() {
        return appointments;
    }

    public void setAppointments(String[] appointments) {
        this.appointments = appointments;
    }
}
