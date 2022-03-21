package case_study.models;

public class Employee extends Person{
    private String employeeID, degree, position, salary;

    public Employee(String employeeID,String name, String birthDay, String gender, String iDCard, String phone, String email,  String degree, String position, String salary) {
        super(name, birthDay, gender, iDCard, phone, email);
        this.employeeID = employeeID;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
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

    @Override
    public String toString() {
        return
                "employeeID='" + employeeID + '\'' + super.toString()+
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'';
    }
//    String employeeID,String name, String birthDay, String gender, String iDCard,
//    String phone, String email,  String degree, String position, String salary
    public String getInfoToCSV(){
        return this.getEmployeeID()+","+this.getName()+","+this.getBirthDay()+","+this.getGender()+","+
                this.getiDCard()+","+this.getPhone()+","+this.getEmail()+","+this.getDegree()+","+
                this.getPosition()+","+this.getSalary();
    }
}
