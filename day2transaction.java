// You are using Java
import java.util.Scanner;

class Transaction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double withdraw = sc.nextDouble();
        double result= 50000.0-withdraw;
        if(withdraw>50000){
            System.out.println("Available account balance:  \n50000.0\nEnter the Amount to withdraw: $\n\nCurrent account balance:50000.0\n\nTransaction Successful: False");
        }
        else{
        System.out.println("Available account balance:  \n"+"50000.0\n"+"Enter the Amount to withdraw: $\n\n"+"Current account balance:"+result+"\n\n"+"Transaction Successful: true");
            
        }
    }
}
