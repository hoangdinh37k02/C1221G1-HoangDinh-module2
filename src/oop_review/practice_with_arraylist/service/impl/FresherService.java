package oop_review.practice_with_arraylist.service.impl;

import oop_review.practice_with_arraylist.models.FresherCandidate;
import oop_review.practice_with_arraylist.service.CandidateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherService implements CandidateService {

    public FresherService (List<FresherCandidate> fresherList) {
        this.fresherList = fresherList;
    }

    public FresherService(){}

    public List<FresherCandidate> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<FresherCandidate> fresherList) {
        this.fresherList = fresherList;
    }

    Scanner input = new Scanner(System.in);
    List<FresherCandidate> fresherList = new ArrayList<>();
    FresherCandidate fresherCandidate = new FresherCandidate();

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
        System.out.print("Please input candidate's year of graduation: ");
        String yearOfGra = String.valueOf(input.nextLine());
        System.out.print("Please input candidate's rank of graduation: ");
        String rankOfGra = String.valueOf(input.nextLine());

        fresherCandidate = new FresherCandidate(id, firstName, lastName, birthDay, address, phone, email, yearOfGra, rankOfGra);
        fresherList.add(fresherCandidate);
    }

    @Override
    public void searchCandidate() {

    }

    @Override
    public String toString() {
        return "FresherService{" +
                "input=" + input +
                ", fresherList=" + fresherList +
                ", fresherCandidate=" + fresherCandidate +
                '}';
    }
}
