public class Doctor {
    private String[] specialization;
    private double experience;
    private String designation;
    private String[] appointments;

    public String[] getSpecialization() {
        return specialization;
    }

    public Doctor(String[] specialization, double experience, String designation, String[] appointments) {
        this.specialization = specialization;
        this.experience = experience;
        this.designation = designation;
        this.appointments = appointments;
    }

    public void setSpecialization(String[] specialization) {
        this.specialization = specialization;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String[] getAppointments() {
        return appointments;
    }

    public void setAppointments(String[] appointments) {
        this.appointments = appointments;
    }
}