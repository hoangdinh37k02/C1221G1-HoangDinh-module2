package oop_review.demo1.models;

public class Experience extends Candidate{
    private int yearOfExp;
    private String proSkill;

    public Experience(int candidateId, int birthDay, int candidateType, String firstName, String lastName, String phone, String address, String email, int yearOfExp, String proSkill) {
        super(candidateId, birthDay, candidateType, firstName, lastName, phone, address, email);
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

    public String getInfoToCSV(){
        return this.getCandidateId()+","+this.getBirthDay()+","+this.getCandidateType()+","+this.getFirstName()+","+this.getLastName()+","+this.getPhone()+","+
                this.getAddress()+","+this.getEmail()+","+this.yearOfExp+","+this.getProSkill();
    }

//    @Override
//    public String toString() {
//        return "Experience{" +
//                "yearOfExp=" + yearOfExp +
//                ", proSkill='" + proSkill + '\'' +
//                '}';
//    }
}
