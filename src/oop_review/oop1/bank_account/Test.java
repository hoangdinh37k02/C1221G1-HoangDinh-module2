package oop_review.oop1.bank_account;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double input_money;
        double withdraw;
        double amountAfterWithdraw;
        double amountAfterExpiration;
        Account account=new Account(12123, "Dino");
        System.out.println(account.getMoney());

        Account account1=new Account();
        account1.setName("Hoang Dinh");
        account1.setAccount(12345);
        account1.setMoney(20000000);
        do {
            System.out.println("Please input your amount you want to input:");
            input_money=input.nextDouble();
            if (input_money>0){
                account1.inputMoney(input_money);
            } else {
                System.out.println("Your input must > 0");
            }

        } while (input_money<=0);


        do {
            System.out.println("Please input your amount you want to withdraw:");
            withdraw = input.nextDouble();
            amountAfterWithdraw=account1.withdrawMoney(withdraw);
            if (amountAfterWithdraw<0){
                System.out.println("Amount money of your account is not enough! or amount your want to withdraw is invalid!");
            } else {
                System.out.println("Remain money is: " +amountAfterWithdraw);
            }

        } while (amountAfterWithdraw==-1);

        amountAfterExpiration=account1.expire();
        System.out.println("Remain money after expiration is: " + amountAfterExpiration);
        System.out.println(account1.toString());

    }
}
