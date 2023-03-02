
public class Doctor extends Person {
    private String[] specialization;
    private double experience;
    private String designation;
    private Appointment[] appointments;

    public Doctor(String[] specialization, double experience, String designation, Appointment[] appointments) {
        this.specialization = specialization;
        this.experience = experience;
        this.designation = designation;
        this.appointments = appointments;
    }

    public Doctor(String id, String name, double age, String gender, String[] specialization, double experience,
            String designation, Appointment[] appointments) {
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