public class Appointment {
    private int doctorIndex;
    private int patientIndex;
    private String time;
    private boolean status;

    public Appointment(int doctorIndex, int patientIndex, String time, boolean status) {
        this.doctorIndex = doctorIndex;
        this.patientIndex = patientIndex;
        this.time = time;
        this.status = status;
    }

    public int getDoctorIndex() {
        return doctorIndex;
    }

    public void setDoctorIndex(int doctorIndex) {
        this.doctorIndex = doctorIndex;
    }

    public int getPatientIndex() {
        return patientIndex;
    }

    public void setPatientIndex(int patientIndex) {
        this.patientIndex = patientIndex;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
