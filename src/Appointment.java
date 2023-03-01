public class Appointment {
    private String time;
    private int doctorId;
    private int patientId;
    private boolean status;

    public Appointment(String time, int doctorId, int patientId, boolean status) {
        this.time = time;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
