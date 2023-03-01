public class Admin {
    private String designation;
    private String department;

    public Admin(String designation, String department) {
        this.designation = designation;
        this.department = department;
    }

    public Admin(String designation, String department, String id, String name, double age, String gender) {
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
