package colection_review.controller;

import colection_review.models.Experience;
import colection_review.models.Fresher;
import colection_review.service.CandidateService;
import colection_review.service.impl.FresherServiceImpl;

public class FresherController extends CandidateBaseInfoController{
    private Integer yearOfGra;
    private String rankOfGra;
    private int candidateType=1;

    static CandidateService freshService = new FresherServiceImpl();

    static {
        freshService.addCandidate(new Fresher(3, "Son", "Nguyen", "12/12", "Hn","0903667291","@gmail.com", 1,2020,"good"));

    }

    public void addNewFresh(){
        String choice;
        while (true){
            System.out.println("Add a new candidate: ");
            super.createCandidateBaseInfo();
            System.out.print("Year of graduation: ");
            this.yearOfGra = Integer.valueOf(input.nextLine());
            System.out.println("rank of graduation: ");
            this.rankOfGra = input.nextLine();

            Fresher fresher = new Fresher(super.candidateId,super.firstName,super.lastName,super.birthDay,super.address,super.phone,super.email, this.candidateType,this.yearOfGra, this.rankOfGra);
            freshService.addCandidate(fresher);
            System.out.println("Addition finish");
            System.out.println("Do you want to continue: Y/N");
            choice = input.nextLine();
            if ("N".equals(choice)){
                break;
            }
        }
        System.out.println("candidates be added: ");
        freshService.display();
    }

    public void searchExperience(String name){
        boolean isFound = freshService.searchCandidate(name);
        if (!isFound){
            System.out.println("Not found candidate");
        }
    }
}
