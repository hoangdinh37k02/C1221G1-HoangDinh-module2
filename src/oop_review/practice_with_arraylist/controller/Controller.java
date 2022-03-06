package oop_review.practice_with_arraylist.controller;

import oop_review.practice_with_arraylist.models.ExperienceCandidate;
import oop_review.practice_with_arraylist.models.FresherCandidate;
import oop_review.practice_with_arraylist.models.InternCandidate;
import oop_review.practice_with_arraylist.service.impl.ExperienceService;
import oop_review.practice_with_arraylist.service.impl.FresherService;
import oop_review.practice_with_arraylist.service.impl.InternService;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Please input your choice");
            choice = Integer.parseInt(input.nextLine());
            ExperienceService experienceService = new ExperienceService();
            FresherService fresherService = new FresherService();
            InternService internService = new InternService();


            switch (choice){
                case 1:
                    int choice1;
                    do {
                        experienceService.addCandidate();
                        System.out.println("Do you want to continue: 1: Yes; 2: No");
                        choice1 = Integer.parseInt(input.nextLine());
                        switch (choice1) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Candidates that you created");
                                for (ExperienceCandidate i: experienceService.getExperienceList()) {
                                    System.out.println(i);
                                }
                                continue;
                            default:
                                System.out.println("Your choice is invalid");
                                break;
                        }
                    } while (choice1!=2);
                    break;
                case 2:
                    int choice2;
                    do {
                        fresherService.addCandidate();
                        System.out.println("Do you want to continue: 1: Yes; 2: No");
                        choice2 = Integer.parseInt(input.nextLine());
                        switch (choice2) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Candidates that you created");
                                for (FresherCandidate i: fresherService.getFresherList()) {
                                    System.out.println(i);
                                }
                                continue;
                            default:
                                System.out.println("Your choice is invalid");
                                break;
                        }
                    } while (choice2!=2);
                    break;
                case 3:
                    int choice3;
                    do {
                        internService.addCandidate();
                        System.out.println("Do you want to continue: 1: Yes; 2: No");
                        choice3 = Integer.parseInt(input.nextLine());
                        switch (choice3) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Candidates that you created");
                                for (InternCandidate i: internService.getInternList()) {
                                    System.out.println(i);
                                }
                                continue;
                            default:
                                System.out.println("Your choice mean that you want to continue");
                                break;
                        }
                    } while (choice3!=2);
                    break;
                case 4:
                    System.out.println("all candidates in list");

                case 5:
                    System.exit(5);
                default:
                    System.out.println("your choice is invalid");
                    break;
            }


        } while (choice!=5);
    }
}
