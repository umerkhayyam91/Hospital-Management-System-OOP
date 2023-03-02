public class Admin extends Person {
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
