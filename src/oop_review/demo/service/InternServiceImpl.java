package oop_review.demo.service;

import oop_review.demo.models.Candidate;
import oop_review.demo.models.Experience;
import oop_review.demo.models.Intern;

import java.util.ArrayList;
import java.util.Scanner;


public class InternServiceImpl implements ICandidate {
    private int candidateID, candidateType, birthDate;
    private String firstName, lastName, address, email, phone, major, university;
    static ArrayList<Intern> internArrayList = new ArrayList<Intern>();
    Scanner scanner = new Scanner(System.in);

    static {
        Intern intern1 = new Intern(2001, 2, 2002, "0978335612", "An","Pham","QN","@gmail.com","IT","UDA");
        internArrayList.add(intern1);
        candidateList.add(intern1);
    }


    @Override
    public void add() {
        createBaseInfo();
        System.out.print("major: ");
        major = scanner.nextLine();
        System.out.print("name of university: ");
        university = scanner.nextLine();

        Intern intern = new Intern(candidateID,candidateID,birthDate,phone,firstName,lastName,address,email,major,university);
        internArrayList.add(intern);
        candidateList.add(intern);
    }

    @Override
    public void display() {
        for (Candidate candidate: candidateList) {
            System.out.println(candidate);
        }
    }

    @Override
    public void search() {
        System.out.println("Enter name you want to find: ");
        String name = scanner.nextLine().toLowerCase();
        for (Intern intern: internArrayList) {
            boolean isFirstName = intern.getFirstName().toLowerCase().contains(name);
            boolean isLastName = intern.getLastName().toLowerCase().contains(name);
            if (isFirstName||isLastName){
                System.out.println(intern);
            } else {
                System.out.println("Your candidate is not found!");
            }
        }
    }

    @Override
    public void createBaseInfo() {
        System.out.print("Candidate's id: ");
        candidateID = Integer.parseInt(scanner.nextLine());
        candidateType=2;
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
