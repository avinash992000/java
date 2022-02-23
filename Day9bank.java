
class BankAccount {
    private String name;
    public BankAccount(String name) {
        this.name = name;
    }
    
    public void withdraw(int n) throws Exception {
        if (n > 100) {
            throw new Exception("Amount too large.");
        }
    }
}

// You are using Java
import java.util.Scanner;

class Account{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BankAccount b1 = new BankAccount("Sunil");
        try{b1.withdraw(n);}
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Done");
        
    }
}
