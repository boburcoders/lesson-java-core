package oop.encapculation.EncapSualtion;

public class Account {
    /*
     * OOP -> Object Orineted Programming
     * Encapsualtion, Inherinatnce, Polimorphizm, Abstraction, Class,Object
     * */
    private int id; //auto increment /1
    private double balance;
    private int userId;
    private int bankId;

    /*
    * id, age,gpa,score,
    * */

    /*
    * private in class
    * default in package
    * protected in package /subclass
    * public
    * */

    public double getBalance() {
        if (userId == 12)
            return balance;
        return 0.0;

    }

    public double addBalance(double newBalance) {
        //
        double oldBalance = this.getBalance();
        if (balance > 0) {
            oldBalance += newBalance;
            this.setBalance(oldBalance);
        } else
            System.out.println("balance must no be negative");
        return oldBalance;
    }

    public void setBalance(double balance) {
        //session kim balance tolidir
        // qachon
        if (balance > 0) {
            this.balance = balance;
        } else
            System.out.println("balance must no be negative");
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }
}
