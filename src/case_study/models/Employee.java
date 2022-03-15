package case_study.models;

public class Employee extends Person{
    private String EmployeeID, grade, position, salary;

    public Employee(String name, String birthDay, String gender, String IDCard, String phone, String email, String employeeID, String grade, String position, String salary) {
        super(name, birthDay, gender, IDCard, phone, email);
        EmployeeID = employeeID;
        this.grade = grade;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
