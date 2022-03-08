package oop_review.demo1.controller;

import oop_review.demo1.service.ExperienceServiceImpl;
import oop_review.demo1.service.FresherServiceImpl;
import oop_review.demo1.service.InternServiceImpl;

import java.util.Scanner;

public class ControllerCandidate {
    public void main(){
        ExperienceServiceImpl experienceService=new ExperienceServiceImpl();
        FresherServiceImpl fresherService = new FresherServiceImpl();
        InternServiceImpl internService = new InternServiceImpl();
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
                    String answer;
                    do {
                        System.out.print("Do you want to continue? Y/N");
                        answer = scanner.nextLine().toUpperCase();
                        if ("Y".contains(answer)){
                            experienceService.add();
                        } else {
                            experienceService.display();
                        }
                    }while ("Y".contains(answer));
                    break;
                case 2:
                    fresherService.add();
                    String answer1;
                    do {
                        System.out.print("Do you want to continue? Y/N");
                        answer1 = scanner.nextLine().toUpperCase();
                        if ("Y".contains(answer1)){
                            fresherService.add();
                        } else {
                            experienceService.display();
                        }
                    }while ("Y".contains(answer1));
                    break;
                case 3:
                    internService.add();
                    String answer2;
                    do {
                        System.out.print("Do you want to continue? Y/N");
                        answer2 = scanner.nextLine().toUpperCase();
                        if ("Y".contains(answer2)){
                            internService.add();
                        } else {
                            experienceService.display();
                        }
                    }while ("Y".contains(answer2));
                    break;
                case 4:
                    experienceService.display();
                    int choice1;
                    do {
                        System.out.println("Enter type of candidate that you want to find: (0: Experience; 1: Fresher; 2: Intern)");
                        choice1=Integer.parseInt(scanner.nextLine());
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
                                System.out.println("invalid");
                                break;
                        }
                    } while (choice1!=0&&choice1!=1&&choice1!=2);
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
