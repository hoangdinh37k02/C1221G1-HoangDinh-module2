package oop_review.practice_with_arraylist.service.impl;

import oop_review.practice_with_arraylist.models.InternCandidate;
import oop_review.practice_with_arraylist.service.CandidateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternService implements CandidateService {
    public InternService (List<InternCandidate> internList){
        this.internList = internList;
    }

    public InternService(){}

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public List<InternCandidate> getInternList() {
        return internList;
    }

    public void setInternList(List<InternCandidate> internList) {
        this.internList = internList;
    }

    public InternCandidate getInternCandidate() {
        return internCandidate;
    }

    public void setInternCandidate(InternCandidate internCandidate) {
        this.internCandidate = internCandidate;
    }

    Scanner input = new Scanner(System.in);
    List<InternCandidate> internList = new ArrayList<>();
    InternCandidate internCandidate = new InternCandidate();
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
        System.out.print("Please input candidate's major: ");
        String major = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's name of university: ");
        String nameOfUniversity = String.valueOf(input.nextLine());

        internCandidate = new InternCandidate(id, firstName, lastName, birthDay, address, phone, email, major, nameOfUniversity);
        internList.add(internCandidate);
    }

    @Override
    public void searchCandidate() {

    }

    @Override
    public String toString() {
        return "InternService{" +
                "input=" + input +
                ", internList=" + internList +
                ", internCandidate=" + internCandidate +
                '}';
    }
}
