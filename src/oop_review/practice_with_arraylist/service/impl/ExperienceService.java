package oop_review.practice_with_arraylist.service.impl;

import oop_review.practice_with_arraylist.models.ExperienceCandidate;
import oop_review.practice_with_arraylist.service.CandidateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceService implements CandidateService {
    public ExperienceService (List<ExperienceCandidate> experienceList){
        this.experienceList = experienceList;
    }

    public ExperienceService(){}

    public List<ExperienceCandidate> getExperienceList() {
        return experienceList;
    }
    public void setExperienceList(List<ExperienceCandidate> experienceList) {
        this.experienceList = experienceList;
    }

    Scanner input = new Scanner(System.in);
    ExperienceCandidate experienceCandidate =new ExperienceCandidate();
    List<ExperienceCandidate> experienceList = new ArrayList<>();

    @Override
    public void addCandidate() {
        System.out.print("Please input candidate's id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("Please input candidate's first_name: ");
        String firstName = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's last_name: ");
        String lastName = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's birthday: ");
        String birthDay = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's address: ");
        String address = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's phone: ");
        String phone = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's email: ");
        String email = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's year of experience: ");
        int expInYear = Integer.parseInt(input.nextLine());
        System.out.print("Please input candidate's professional skill: ");
        String proSkill = String.valueOf(input.nextLine());

        experienceCandidate = new ExperienceCandidate(id, firstName, lastName,birthDay, address, phone,email,expInYear,proSkill);
        experienceList.add(experienceCandidate);
    }

    @Override
    public void searchCandidate() {

    }

    @Override
    public void display() {
        for (ExperienceCandidate e: experienceList) {
            System.out.println(e);
        }
    }


    @Override
    public String toString() {
        return "ExperienceService{" +
                "experienceList=" + experienceList +
                ", input=" + input +
                ", experienceCandidate=" + experienceCandidate +
                '}';
    }
}
