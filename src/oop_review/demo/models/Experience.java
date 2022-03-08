package oop_review.demo.models;

public class Experience extends Candidate{
    private int yearOfExp;
    private String proSkill;

    public Experience(){}

    public Experience(int candidateID, int candidateType, int birthDate, String phone, String firstName, String lastName, String address, String email, int yearOfExp, String proSkill) {
        super(candidateID, candidateType, birthDate, phone, firstName, lastName, address, email);
        this.yearOfExp = yearOfExp;
        this.proSkill = proSkill;
    }

    public Experience(int yearOfExp, String proSkill) {
        this.yearOfExp = yearOfExp;
        this.proSkill = proSkill;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
