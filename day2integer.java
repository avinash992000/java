// You are using Java
import java.util.Scanner;

class Integer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1 || n==4){
            System.out.println("ONE");
        }
        else if(n==2 || n==3 || n==5){
            System.out.println("TWO");
        }
        else{
            System.out.println("THREE");
        }
    }
}
