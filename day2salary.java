// You are using Java
import java.util.Scanner;

class Salary{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result = (n<3000)? n:n+500;
        System.out.println("Enter the salary of Employee\n"+"Total Salary of Employee "+result);
    }
}
