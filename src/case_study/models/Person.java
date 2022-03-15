package case_study.models;

public abstract class Person {
    private String name, birthDay, gender, IDCard, phone, email;

    public Person(){}

    public Person(String name, String birthDay, String gender, String IDCard, String phone, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.IDCard = IDCard;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + name + '\'' +
                ", ngaySinh='" + birthDay + '\'' +
                ", gioiTinh='" + gender + '\'' +
                ", SoCMND='" + IDCard + '\'' +
                ", dienThoai='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
