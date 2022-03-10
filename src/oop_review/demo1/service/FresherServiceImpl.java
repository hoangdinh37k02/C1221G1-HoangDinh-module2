package oop_review.demo1.service;

import oop_review.demo1.models.Experience;
import oop_review.demo1.models.Fresher;
import oop_review.demo1.util.ReadAndWriteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherServiceImpl implements ICandidate {
    private int candidateId, birthDay, candidateType, graduationTime;
    private String firstName, lastName, phone, address, email, graduationRank, university;
    String[] rankOfGraduation = {"Excellent","Good","Fair","Poor"};

    static ArrayList<Fresher> fresherArrayList=new ArrayList<>();
    static {
        Fresher fresher = new Fresher(2001,1999,1,"Son","Tran","0935662717", "DN","@gmail.com",2022,"good","UDA");
        fresherArrayList.add(fresher);
//        CANDIDATE_ARRAY_LIST.add(fresher);
    }
    Scanner scanner=new Scanner(System.in);

    @Override
    public void add() {
        createBaseInfo();
        System.out.print("Year of graduation: ");
        graduationTime=Integer.parseInt(scanner.nextLine());
        int choice;
        do {
            System.out.println("Enter rank of graduation: (1. Excellent; 2. Good; 3. Fair; 4.Poor)");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    graduationRank=rankOfGraduation[0];
                    break;
                case 2:
                    graduationRank=rankOfGraduation[1];
                    break;
                case 3:
                    graduationRank=rankOfGraduation[2];
                    break;
                case 4:
                    graduationRank=rankOfGraduation[3];
                    break;
                default:
                    System.out.println("Your choice is invalid!\n" +
                            "make choice again");
                    break;
            }
        }while (choice!=1&&choice!=2&&choice!=3&&choice!=4);
        System.out.print("Name of university: ");
        university=scanner.nextLine();

        Fresher fresher=new Fresher(candidateId,birthDay,candidateType,firstName,lastName,phone,address,email,graduationTime,graduationRank,university);
        fresherArrayList.add(fresher);
//        CANDIDATE_ARRAY_LIST.add(fresher);
        ReadAndWriteCSV.writeFresherToCSV(fresherArrayList,true);
    }

    @Override
    public void display() {
        List<Fresher> fresherList = ReadAndWriteCSV.readFresherFromCSV();
        for (int i=0; i<fresherList.size(); i++){
            System.out.println((i+1)+"."+fresherList.get(i));
        }
    }

    @Override
    public void search() {
        System.out.print("Please enter candidate's name that you want to find: ");
        String name = scanner.nextLine().toLowerCase();
        for (Fresher fresher:fresherArrayList) {
            boolean isFirstName = fresher.getFirstName().toLowerCase().contains(name);
            boolean isLastName = fresher.getLastName().toLowerCase().contains(name);
            if (isFirstName||isLastName){
                System.out.println(fresher);
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
        candidateType=1;
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
