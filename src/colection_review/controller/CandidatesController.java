package colection_review.controller;

import colection_review.models.Fresher;
import colection_review.models.Intern;

import java.util.Scanner;

public class CandidatesController {
    Scanner input = new Scanner(System.in);
    ExperienceController experienceController = new ExperienceController();
    FresherController fresherController = new FresherController();
    InternController internController = new InternController();

    public void main(){
        int choice;
        do {
            System.out.println("------------CANDIDATE MANAGER SYSTEM-------------\n"+
                    "1. Experience\n"+
                    "2. Fresher\n"+
                    "3. Intern\n"+
                    "4. Searching\n"+
                    "5. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    experienceController.addNewExperience();
                    break;
                case 2:
                    fresherController.addNewFresh();
                    break;
                case 3:
                    internController.addNewIntern();
                    break;
                case 4:
                    searchCandidates();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("your choice is invalid");
                    break;
            }
        } while (choice!=5);
    }

    public void searchCandidates(){
        int choice;
        do {
            System.out.println("Type of cadidates: \n"+
                    "0. Experience\n"+
                    "1. Fresher\n"+
                    "2. Intern\n"+
                    "3. exit\n"+
                    "Please choice");
            choice = Integer.parseInt(input.nextLine());
            System.out.println("Enter name that you want to find");
            String findName = input.nextLine();
            switch (choice){
                case 0:
                    experienceController.searchExperience(findName);
                    break;
                case 1:
                    fresherController.searchExperience(findName);
                    break;
                case 2:
                    internController.searchExperience(findName);
                    break;
                default:
                    System.out.println("Your choice is invalid");
                    break;
            }
        } while (choice!=3);
    }
}
