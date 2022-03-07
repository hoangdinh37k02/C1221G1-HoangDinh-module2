package colection_review.controller;

import java.util.Scanner;

public class CandidateBaseInfoController {
    public int candidateId;
    public String firstName;
    public String lastName;
    public String birthDay;
    public String address;
    public String phone;
    public String email;
    Scanner input = new Scanner(System.in);

    public void createCandidateBaseInfo(){
        System.out.print("Candidate's id: ");
        this.candidateId = Integer.valueOf(input.nextLine());
        System.out.print("Candidate's first name: ");
        this.firstName = input.nextLine();
        System.out.print("Candidate's last name: ");
        this.lastName = input.nextLine();
        System.out.print("Candidate's birthday: ");
        this.birthDay = input.nextLine();
        System.out.print("Candidate's address: ");
        this.address = input.nextLine();
        System.out.print("Candidate's phone: ");
        this.phone = input.nextLine();
        System.out.print("Candidate's email: ");
        this.email = input.nextLine();
    }
}
