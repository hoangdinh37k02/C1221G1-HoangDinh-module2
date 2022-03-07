package colection_review.models;

public class Fresher extends Candidates {
    private int yearOfGra;
    private String rankOfGra;

    public Fresher(){

    }

    public Fresher(int id, String firstName, String lastName, String birthDay, String address, String phone, String email, int candidateType, int yearOfGra, String rankOfGra) {
        super(id, firstName, lastName, birthDay, address, phone, email, candidateType);
        this.yearOfGra = yearOfGra;
        this.rankOfGra = rankOfGra;
    }

    public int getYearOfGra() {
        return yearOfGra;
    }

    public void setYearOfGra(int yearOfGra) {
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
