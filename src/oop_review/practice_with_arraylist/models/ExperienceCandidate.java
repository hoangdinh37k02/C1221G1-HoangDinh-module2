package oop_review.practice_with_arraylist.models;

public class ExperienceCandidate extends Candidates {
    private int expInYear;
    private String proSkill;

    public ExperienceCandidate(){}

    public ExperienceCandidate(int id, String firstName, String lastName, String birthDay, String address, String phone, String email, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString()+
                "; ExperienceCandidate{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
