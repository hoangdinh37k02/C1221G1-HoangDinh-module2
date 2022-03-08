package oop_review.demo.service;

import oop_review.demo.models.Experience;
import oop_review.demo.models.Fresher;
import oop_review.demo.models.Candidate;

import java.util.ArrayList;
import java.util.Scanner;

public class FresherServiceImpl implements ICandidate {
    private int candidateID, candidateType, birthDate;
    private String firstName, lastName, address, email, phone, graduationDate, graduationRank, education;
    String[] rankOfGraduation = {"Excellent","Good","Fair","Poor"};
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Fresher> fresherArrayList = new ArrayList<>();

    static {
        Fresher fresher1 = new Fresher(1001, 1, 2000, "0903771625","Hoa","Le","Hn", "@gmail.com", "2021", "Good","IT");
        fresherArrayList.add(fresher1);
        candidateList.add(fresher1);
    }


    @Override
    public void add() {
        createBaseInfo();
        System.out.print("Enter rank of graduation (0: Excellent, 1: Good, 2: Fair, 3: poor\n"+
                "Please choice");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 0:
                graduationRank = rankOfGraduation[0];
                break;
            case 1:
                graduationRank = rankOfGraduation[1];
                break;
            case 2:
                graduationRank = rankOfGraduation[2];
                break;
            case 3:
                graduationRank = rankOfGraduation[3];
                break;
            default:
                System.out.println("your choice is invalid");
        }
        System.out.print("Graduation time: ");
        graduationDate = scanner.nextLine();
        System.out.println("name of university: ");
        education = scanner.nextLine();
        Fresher fresher = new Fresher(candidateID,candidateType,birthDate,phone,firstName,lastName,address,email,graduationDate,graduationRank,education);
        fresherArrayList.add(fresher);
        candidateList.add(fresher);
    }

    @Override
    public void display() {
        for (Candidate candidate:candidateList) {
            System.out.println(candidate);
        }
    }

    @Override
    public void search() {
        System.out.println("Enter name you want to find: ");
        String name = scanner.nextLine().toLowerCase();
        for (Fresher fresher: fresherArrayList) {
            boolean isFirstName = fresher.getFirstName().toLowerCase().contains(name);
            boolean isLastName = fresher.getLastName().toLowerCase().contains(name);
            if (isFirstName||isLastName){
                System.out.println(fresher);
            } else {
                System.out.println("Your candidate is not found!");
            }
        }
    }

    @Override
    public void createBaseInfo() {
        System.out.print("Candidate's id: ");
        candidateID = Integer.parseInt(scanner.nextLine());
        candidateType=1;
        do {
            System.out.print("birthday: ");
            birthDate = Integer.parseInt(scanner.nextLine());
            if (birthDate<1900||birthDate>2004){
                System.out.println("Candidate' birthday is invalid");
            }
        } while (birthDate<1900||birthDate>2004);
        do {
            System.out.print("phone: ");
            phone = scanner.nextLine();
            if (phone.length()<10){
                System.out.println("Candidate's phone is invalid");
            }
        } while (phone.length()<10);
        System.out.print("Candidate's first name: ");
        firstName = scanner.nextLine();
        System.out.print("Candidate's last name: ");
        lastName = scanner.nextLine();
        System.out.print("Candidate's address: ");
        address = scanner.nextLine();
        System.out.print("Candidate's email: ");
        email = scanner.nextLine();
    }
}
