package colection_review.models;

import java.util.Objects;

public class Experience extends Candidates {
    private int expInYear;
    private String proSkill;

    public Experience(){}

    public Experience(int id, String firstName, String lastName, String birthDay, String address, String phone, String email, int candidateType, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email, candidateType);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Experience)) return false;
        Experience that = (Experience) o;
        return super.getId() == super.getId();
    }
}
