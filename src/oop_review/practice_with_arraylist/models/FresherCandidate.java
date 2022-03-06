package oop_review.practice_with_arraylist.models;

public class FresherCandidate extends Candidates {
    private String yearOfGra;
    private String rankOfGra;

    public FresherCandidate(){

    }

    public FresherCandidate(int id, String firstName, String lastName, String birthDay, String address, String phone, String email, String yearOfGra, String rankOfGra) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.yearOfGra = yearOfGra;
        this.rankOfGra = rankOfGra;
    }

    public String getYearOfGra() {
        return yearOfGra;
    }

    public void setYearOfGra(String yearOfGra) {
        this.yearOfGra = yearOfGra;
    }

    public String getRankOfGra() {
        return rankOfGra;
    }

    public void setRankOfGra(String rankOfGra) {
        this.rankOfGra = rankOfGra;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", FresherCandidate{" +
                "yearOfGra='" + yearOfGra + '\'' +
                ", rankOfGra='" + rankOfGra + '\'' +
                '}';
    }
}
