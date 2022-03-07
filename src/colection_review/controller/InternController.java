package colection_review.controller;

import colection_review.models.Fresher;
import colection_review.models.Intern;
import colection_review.service.CandidateService;
import colection_review.service.impl.InternServiceImpl;

public class InternController extends CandidateBaseInfoController{
    private String major;
    private String nameOfUniversity;
    private int candidateType=2;

    static CandidateService internService = new InternServiceImpl();

    static {
        internService.addCandidate(new Intern(4, "Hai","Tran","30/03","QN","0935772881","@gmail.com",2,"code","ABC"));

    }

    public void addNewIntern(){
        String choice;
        while (true){
            System.out.println("Add a new candidate: ");
            super.createCandidateBaseInfo();
            System.out.print("major: ");
            this.major = input.nextLine();
            System.out.println("name of university ");
            this.nameOfUniversity = input.nextLine();

            Intern intern = new Intern(super.candidateId,super.firstName,super.lastName,super.birthDay,super.address,super.phone,super.email, this.candidateType,this.major, this.nameOfUniversity);
            internService.addCandidate(intern);
            System.out.println("Addition finish");
            System.out.println("Do you want to continue: Y/N");
            choice = input.nextLine();
            if ("N".equals(choice)){
                break;
            }
        }
        System.out.println("candidates be added: ");
        internService.display();
    }

    public void searchExperience(String name){
        boolean isFound = internService.searchCandidate(name);
        if (!isFound){
            System.out.println("Not found candidate");
        }
    }

}
