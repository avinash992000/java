// You are using Java
import java.util.Scanner;

class ScannerClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered string Value ");
        System.out.println("Entered Integer Value ");
        System.out.println("Entered Integer Value ");
        String str = sc.nextLine();
        int n = sc.nextInt();
        float m = sc.nextInt();
        System.out.println("You entered string  : "+str);
        System.out.println("You entered integer : "+n);
        System.out.println("You entered float : "+ m);
        
    }
}
