
public class Doctor extends Person {
    private String designation;
    private double experience;
    private String[] specialization;
    private Appointment[] appointments;

    public Doctor() {
    }

    public Doctor(String designation, double experience, String[] specialization, Appointment[] appointments) {
        this.designation = designation;
        this.experience = experience;
        this.specialization = specialization;
        this.appointments = appointments;
    }

    public Doctor(String id, String name, double age, String gender, String designation, double experience,
            String[] specialization,
            Appointment[] appointments) {
        super(id, name, age, gender);
        this.specialization = specialization;
        this.experience = experience;
        this.designation = designation;
        this.appointments = appointments;
    }

    public String[] getSpecialization() {
        return specialization;
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

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }
}