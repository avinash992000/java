// You are using Java
import java.util.Scanner;

class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m=0;
        int i=n;
        if(n==0){
            System.out.println("0");
        }
        else{
            while(i>0){
                double a=sc.nextDouble();
                m+=a;i--;
            }
            System.out.println(m/n);
            
        }
    }
}
