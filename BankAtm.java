package SkiilsPw.OOPSJava;

public class BankAtm {
    public static void main(String[] args) {
        BackEnd acc = new BackEnd();
        double balance1 = acc.setBalance(1000);
        System.out.print("Old balance : " + acc.setBalance(balance1));
        System.out.println();
        double balance2 = acc.getBalance(400);
        System.out.println( "New balance " + acc.getBalance(balance2));
    }
}
class BackEnd{
    private double balance;
    public boolean validate(String name,String password){
        return name.equalsIgnoreCase("Mridul") && password.equals("Mridul2656");
    }
    public double setBalance(double balance){
        boolean result = validate("Mridul","Mridul2656");
        if ( result == true) {
            this.balance = this.balance + balance;
            return balance;
        }
        else System.out.println("INVALID");
        return 0.0;
    }
    public double getBalance(double balance){
        boolean result = validate("Mridul","Mridul2656");
        if ( result == true) {
            this.balance = this.balance - balance;
            return balance;
        }
        else System.out.println("INVALID");
        return 0.0;
    }
}

