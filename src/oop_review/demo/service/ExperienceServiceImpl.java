package oop_review.demo.service;

import oop_review.demo.models.Candidate;
import oop_review.demo.models.Experience;

import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceServiceImpl implements ICandidate{
    static ArrayList<Experience> experienceArrayList = new ArrayList<Experience>();
    private int candidateID, candidateType, birthDate, yearOfExp;
    private String firstName, lastName, address, email,proSkill,phone;
    Scanner scanner = new Scanner(System.in);

    static {
        Experience experience1 = new Experience(0001,0,1995,"0903552612", "dinh1", "hoang", "DN","@gmail.com",2,"java");
        Experience experience2 = new Experience(0002,0,1996,"0900658512", "dinh2", "nguyen", "hue","@gmail.com",4,"C++");
        experienceArrayList.add(experience1);
        experienceArrayList.add(experience2);
        candidateList.add(experience1);
        candidateList.add(experience2);
    }


    @Override
    public void add() {
        createBaseInfo();
        do {
            System.out.print("Candidate's year of experience: ");
            yearOfExp = Integer.parseInt(scanner.nextLine());
            if (yearOfExp<1||yearOfExp>100){
                System.out.println("Candidate's experience is invalid");
            }

        }while (yearOfExp<1||yearOfExp>100);
        System.out.print("Candidate's professional skill: ");
        proSkill = scanner.nextLine();
        Experience experience  =new Experience(candidateID, candidateType, birthDate, phone, firstName, lastName, address, email, yearOfExp, proSkill);
        experienceArrayList.add(experience);
        candidateList.add(experience);

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
        for (Experience experience: experienceArrayList) {
            boolean isFirstName = experience.getFirstName().toLowerCase().contains(name);
            boolean isLastName = experience.getLastName().toLowerCase().contains(name);
            if (isFirstName||isLastName){
                System.out.println(experience);
            } else {
                System.out.println("Your candidate is not found!");
            }
        }
    }

    @Override
    public void createBaseInfo() {
        System.out.print("Candidate's id: ");
        candidateID = Integer.parseInt(scanner.nextLine());
        candidateType=0;
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
