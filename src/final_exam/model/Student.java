package final_exam.model;

public class Student extends Person {
    private String className;
    public Student(int id, String name, String birthDay, String gender, String phone, String className) {
        super(id, name, birthDay, gender, phone);
        this.className = className;
    }

    public String getClassRoomId() {
        return className;
    }

    public void setClassRoomId(String className) {
        this.className= className;
    }

    @Override
    public String toString() {
        return
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", birthDay='" + super.getBirthDay() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", className=" + className;
    }

    public String getInFoToCSV(){
        return this.getId()+","+this.getName()+","+this.getBirthDay()+","+this.getGender()+","+this.getPhone()+","+this.getClassRoomId();
    }
}
