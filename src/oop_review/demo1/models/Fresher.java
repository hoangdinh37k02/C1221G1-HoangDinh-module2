package oop_review.demo1.models;

public class Fresher extends Candidate {
    private int graduationTime;
    private String graduationRank, university;

    public Fresher(int candidateId, int birthDay, int candidateType, String firstName, String lastName, String phone, String address, String email, int graduationTime, String graduationRank, String university) {
        super(candidateId, birthDay, candidateType, firstName, lastName, phone, address, email);
        this.graduationTime = graduationTime;
        this.graduationRank = graduationRank;
        this.university = university;
    }

    public int getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(int graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
