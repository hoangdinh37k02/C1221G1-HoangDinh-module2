package oop_review.demo1.models;

public class Intern extends Candidate {
    private String major, university;

    public Intern(int candidateId, int birthDay, int candidateType, String firstName, String lastName, String phone, String address, String email, String major, String university) {
        super(candidateId, birthDay, candidateType, firstName, lastName, phone, address, email);
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

    public String getInfoToCSV(){
        return this.getCandidateId()+","+this.getBirthDay()+","+this.getCandidateType()+","+this.getFirstName()+","+this.getLastName()+","+this.getPhone()+","+
                this.getAddress()+","+this.getEmail()+","+this.getMajor()+","+this.getUniversity();
    }
}
