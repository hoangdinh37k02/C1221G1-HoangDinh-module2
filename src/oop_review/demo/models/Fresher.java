package oop_review.demo.models;

public class Fresher extends Candidate{
    private String graduationDate,rankOfGraduation,education;

    public Fresher(){

    }

    public Fresher(int candidateID, int candidateType, int birthDate, String phone, String firstName, String lastName, String address, String email, String graduationDate, String rankOfGraduation, String education) {
        super(candidateID, candidateType, birthDate, phone, firstName, lastName, address, email);
        this.graduationDate = graduationDate;
        this.rankOfGraduation = rankOfGraduation;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
