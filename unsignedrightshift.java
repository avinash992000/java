// You are using Java
import java.util.Scanner;

class shift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long m = sc.nextLong();
        long a = n>>>m;
        if(a>0){
            System.out.println(a);
            
        }
        else{
            System.out.println("NEG");
        }
    }
}
