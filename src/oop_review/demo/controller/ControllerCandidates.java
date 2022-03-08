package oop_review.demo.controller;

import oop_review.demo.models.Intern;
import oop_review.demo.service.ExperienceServiceImpl;
import oop_review.demo.service.FresherServiceImpl;
import oop_review.demo.service.InternServiceImpl;

import java.util.Scanner;

public class ControllerCandidates {
    ExperienceServiceImpl experienceService=new ExperienceServiceImpl();
    FresherServiceImpl fresherService = new FresherServiceImpl();
    InternServiceImpl internService = new InternServiceImpl();
    public void main(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----------CANDIDATE MANAGEMENT SYSTEM------------\n" +
                    "1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Intern\n" +
                    "4. Searching\n" +
                    "5. Exit\n" +
                    "Please make your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    experienceService.add();
                    String choice2;
                    do {
                        System.out.println("Do you want to continue: (Y/N)");
                        choice2 = scanner.nextLine();
                        if ("Y".contains(choice2)){
                            experienceService.add();
                        } else {
                            experienceService.display();
                        }
                    } while ("Y".contains(choice2));
                    break;
                case 2:
                    fresherService.add();
                    String choice3;
                    do {
                        System.out.println("Do you want to continue: (Y/N)");
                        choice3 = scanner.nextLine();
                        if ("Y".contains(choice3)){
                            experienceService.add();
                        } else {
                            experienceService.display();
                        }
                    } while ("Y".contains(choice3));
                    break;
                case 3:
                    internService.add();
                    String choice4;
                    do {
                        System.out.println("Do you want to continue: (Y/N)");
                        choice4 = scanner.nextLine();
                        if ("Y".contains(choice4)){
                            experienceService.add();
                        } else {
                            experienceService.display();
                        }
                    } while ("Y".contains(choice4));
                    break;
                case 4:
                    experienceService.display();
                    int choice1;
                    do {
                        System.out.println("Enter type of candidates that you want to find\n" +
                                "0: experience; 1: fresher; 2: intern; 3: exit\n" +
                                "Please make your choice");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1){
                            case 0:
                                experienceService.search();
                                break;
                            case 1:
                                fresherService.search();
                                break;
                            case 2:
                                internService.search();
                                break;
                            default:
                                System.out.println("Your choice is invalid!");
                                break;
                        }
                    } while (choice1!=3);

                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("Your choice is invalid!");
                    break;
            }
        } while (choice!=5);

    }
}
