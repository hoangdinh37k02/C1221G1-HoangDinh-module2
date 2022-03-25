package final_exam.model;

public class Teacher extends Person{
    public Teacher(int id, String name, String birthDay, String gender, String phone) {
        super(id, name, birthDay, gender, phone);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getInFoToCSV(){
        return this.getId()+","+this.getName()+","+this.getBirthDay()+","+this.getGender()+","+this.getPhone();
    }
}
