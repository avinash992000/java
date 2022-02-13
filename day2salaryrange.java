// You are using Java
import java.util.Scanner;

class SalaryRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Salary = sc.nextInt();
        String Result=(Salary<10000)? "low":(Salary>=10000 && Salary<50000)? "medium":"high";
        System.out.println(Result);
    }
}
