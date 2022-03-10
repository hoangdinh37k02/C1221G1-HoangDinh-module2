package oop_review.demo1.service;

import oop_review.demo1.models.Candidate;
import oop_review.demo1.models.Experience;
import oop_review.demo1.models.Intern;
import oop_review.demo1.util.ReadAndWriteCSV;
import ss16_io_text_file.exercise.copyfile.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceServiceImpl implements ICandidate {
    private int candidateId, birthDay, candidateType, yearOfExp;
    private String firstName, lastName, phone, address, email, proSkill;
    static ArrayList<Experience> experienceArrayList = new ArrayList<>();
    static {
        Experience experience = new Experience(1001, 1994,0,"Ha","Nguyen","0907553617","HN","gmail.com",2,"java");
        experienceArrayList.add(experience);
//        CANDIDATE_ARRAY_LIST.add(experience);
    }
    Scanner scanner=new Scanner(System.in);

    @Override
    public void add() {
        createBaseInfo();
        do {
            System.out.print("Candidate's experience: ");
            yearOfExp = Integer.parseInt(scanner.nextLine());
            if (yearOfExp<1||yearOfExp>100){
                System.out.println("invalid!");
            }
        }while (yearOfExp<1||yearOfExp>100);
        System.out.print("Candidate's professional skill: ");
        proSkill = scanner.nextLine();
        Experience experience = new Experience(candidateId,birthDay,candidateType,firstName,lastName,phone,address,email,yearOfExp,proSkill);
        experienceArrayList.add(experience);
//        CANDIDATE_ARRAY_LIST.add(experience);
        ReadAndWriteCSV.writeExperienceToCSV(experienceArrayList,true);
    }

    @Override
    public void display() {
        List<Experience> experienceList = ReadAndWriteCSV.readExperienceFromCSV();
        for (int i=0; i<experienceList.size(); i++){
            System.out.println((i+1)+". "+experienceList.get(i));
        }
    }

    @Override
    public void search() {
        System.out.print("Please enter candidate's name that you want to find: ");
        String name = scanner.nextLine().toLowerCase();
        for (Experience experience:experienceArrayList) {
            boolean isFirstName = experience.getFirstName().toLowerCase().contains(name);
            boolean isLastName = experience.getLastName().toLowerCase().contains(name);
            if (isFirstName||isLastName){
                System.out.println(experience);
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
        candidateType=0;
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
