package oop_review.oop1.bank_account;

public class Account {
    private long account;
    private String name;
    private double money;

    public Account(){}

    public Account(long account, String name, double money) {
        this.account = account;
        this.name = name;
        this.money = money;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account=" + account +
                ", name='" + name + '\'' +
                ", money=" + money + " VND"+
                '}';
    }

    public final double INTEREST = 0.035;

    public Account(long account, String name){
        this.account=account;
        this.name=name;
        this.money=50;
    }

    public double inputMoney(double inputMoney){
        this.setMoney(money+inputMoney);
        return this.getMoney();
    }

    public double withdrawMoney(double withdrawMoney){
        if (money>=withdrawMoney&& withdrawMoney>0){
            this.setMoney(money-withdrawMoney);
            return this.getMoney();
        } else {
            return -1;
        }
    }

    public double expire(){
        this.setMoney(money+money*INTEREST);
        return this.getMoney();
    }
}
