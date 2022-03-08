package oop_review.demo.models;

public class Intern extends Candidate{
    private String major, university;

    public Intern(){}

    public Intern(int candidateID, int candidateType, int birthDate, String phone, String firstName, String lastName, String address, String email, String major, String university) {
        super(candidateID, candidateType, birthDate, phone, firstName, lastName, address, email);
        this.major = major;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
