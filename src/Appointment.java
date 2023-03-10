public class Appointment {
    private int doctorIndex;
    private int patientIndex;
    private String time;
    private boolean status;

    public Appointment() {

    }

    public Appointment(int doctorIndex, int patientIndex, String time, boolean status) {
        this.doctorIndex = doctorIndex;
        this.patientIndex = patientIndex;
        this.time = time;
        this.status = status;
    }

    public void submitAppointment(int doctorAppointmentIndex, int patientAppointmentIndex) {
        Appointment[] docsAppointments = Runner.doctors[this.doctorIndex].getAppointments();
        Appointment[] patAppointments = Runner.patients[this.patientIndex].getAppointments();
        docsAppointments[doctorAppointmentIndex] = Appointment.this;
        patAppointments[patientAppointmentIndex] = Appointment.this;
        System.out.println("Your appointment has been submitted!!");
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
