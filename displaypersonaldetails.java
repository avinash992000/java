// You are using Java
import java.util.Scanner;

class PersonalDetails{
    public static void main(String[] args){
        System.out.println("Entered The Personal Deatils Name , Address , Qualification, Gender and Age ");
        System.out.println("---------------------------------------------------------------------------- ");
        System.out.println("---------------------------------------------------------------------------- ");
        System.out.println("");
        System.out.println("Displaying Personal Deatils");
        System.out.println("----------------------------------------------------------------------------");
        Scanner sc= new Scanner(System.in);
        String Name= sc.nextLine();
        String Address= sc.nextLine();
        String Qualification= sc.nextLine();
        String Gender = sc.nextLine();
        int Age= sc.nextInt();
        System.out.println(" Name :        "+Name);
        System.out.println(" Address :      "+Address);
        System.out.println(" Age :          "+Age);
        System.out.println(" Gender :       "+Gender);
        System.out.println(" Qualification   "+Qualification);
        System.out.println("---------------------------------------------------------------------------- ");
    }
}
