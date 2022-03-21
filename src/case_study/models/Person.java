package case_study.models;

public abstract class Person {
    private String name, birthDay, gender, iDCard, phone, email;

    public Person(){}

    public Person(String name, String birthDay, String gender, String iDCard, String phone, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.iDCard = iDCard;
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

    public String getiDCard() {
        return iDCard;
    }

    public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
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
        return
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", iDCard='" + iDCard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'';
    }
}
