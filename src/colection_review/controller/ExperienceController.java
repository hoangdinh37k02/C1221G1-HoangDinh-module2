package colection_review.controller;

import colection_review.models.Candidates;
import colection_review.models.Experience;
import colection_review.service.CandidateService;
import colection_review.service.impl.ExperienceServiceImpl;

public class ExperienceController extends CandidateBaseInfoController {
    private int expInYear;
    private String proSkill;
    private int candidateType = 0;
    static CandidateService experienceService = new ExperienceServiceImpl();

    static {
        experienceService.addCandidate(new Experience(1, "Dinh", "Hoang", "07/03","Hue", "063517821","@gmail.com",0,2, "java"));
        experienceService.addCandidate(new Experience(2, "Van", "Le", "07/12","da nang", "062233821","@gmail.com",0,4, "C++"));
    }

    public void addNewExperience(){
        String choice;
        while (true){
            System.out.println("Add a new candidate: ");
            super.createCandidateBaseInfo();
            System.out.print("Year of experience: ");
            this.expInYear = Integer.parseInt(input.nextLine());
            System.out.println("Special skill: ");
            this.proSkill = input.nextLine();

            Experience experience = new Experience(super.candidateId,super.firstName,super.lastName,super.birthDay,super.address,super.phone,super.email, this.candidateType,this.expInYear, this.proSkill);
            experienceService.addCandidate(experience);
            System.out.println("Addition finish");
            System.out.println("Do you want to continue: Y/N");
            choice = input.nextLine();
            if ("N".equals(choice)){
                break;
            }
        }
        System.out.println("candidates be added: ");
        experienceService.display();
    }

    public void searchExperience(String name){
        boolean isFound = experienceService.searchCandidate(name);
        if (!isFound){
            System.out.println("Not found candidate");
        }
    }
}
