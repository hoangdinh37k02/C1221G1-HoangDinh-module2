package colection_review.models;

public class Intern extends Candidates {
    private String major;
    private String universityName;

    public Intern(){}

    public Intern(int id, String firstName, String lastName, String birthDay, String address, String phone, String email, int candidateType, String major, String universityName) {
        super(id, firstName, lastName, birthDay, address, phone, email, candidateType);
        this.major = major;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", InternCandidate{" +
                "major='" + major + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
