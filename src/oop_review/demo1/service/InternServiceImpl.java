package oop_review.demo1.service;

import oop_review.demo1.models.Experience;
import oop_review.demo1.models.Fresher;
import oop_review.demo1.models.Intern;
import oop_review.demo1.util.ReadAndWriteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternServiceImpl implements ICandidate {
    private int candidateId, birthDay, candidateType;
    private String firstName, lastName, phone, address, email, major, university;

    static ArrayList<Intern> internArrayList = new ArrayList<>();

    static {
        Intern intern = new Intern(2001,2002,2,"Hai","Hoang","0774516722","hue","@gmail.com","IT","DUE");
        internArrayList.add(intern);
        CANDIDATE_ARRAY_LIST.add(intern);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        createBaseInfo();
        System.out.print("Candidate's major: ");
        major = scanner.nextLine();
        System.out.print("Candidate's university: ");
        university = scanner.nextLine();

        Intern intern = new Intern(candidateId,birthDay,candidateType,firstName,lastName,phone,address,email,major,university);
        internArrayList.add(intern);
//        CANDIDATE_ARRAY_LIST.add(intern);
        ReadAndWriteCSV.writeInternToCSV(internArrayList,true);
    }

    @Override
    public void display() {
        List<Intern> internList = ReadAndWriteCSV.readInternFromCSV();
        for (int i=0; i<internList.size(); i++){
            System.out.println((i+1)+". "+internList.get(i));
        }
    }

    @Override
    public void search() {
        System.out.print("Please enter candidate's name that you want to find: ");
        String name = scanner.nextLine().toLowerCase();
        for (Intern intern:internArrayList) {
            boolean isFirstName = intern.getFirstName().toLowerCase().contains(name);
            boolean isLastName = intern.getLastName().toLowerCase().contains(name);
            if (isFirstName||isLastName){
                System.out.println(intern);
            }
        }
    }

    public void createBaseInfo(){
        System.out.print("Candidate's id: ");
        candidateId = Integer.parseInt(scanner.nextLine());
        do {
            System.out.print("Candidate birthday: ");
            birthDay=Integer.parseInt(scanner.nextLine());
            if (birthDay<1900||birthDay>2024){
                System.out.println("candidate's birthday is invalid!");
            }
        }while (birthDay<1900||birthDay>2024);
        candidateType=2;
        System.out.print("Candidate's first name: ");
        firstName = scanner.nextLine();
        System.out.print("Candidate's last name: ");
        lastName = scanner.nextLine();
        do {
            System.out.print("Candidate's phone: ");
            phone = scanner.nextLine();
            if (phone.length()<10){
                System.out.println("the phone is invalid");
            }
        } while (phone.length()<10);
        System.out.print("Candidate's address: ");
        address = scanner.nextLine();
        System.out.print("Candidate's email: ");
        email = scanner.nextLine();
    }
}
