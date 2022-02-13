// You are using Java
import java.util.Scanner;
class Weights{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight= sc.nextDouble();
        double height = sc.nextDouble();
        double result = weight/height;
        if(result>=0.4 && result<=0.5){
            System.out.println("correct weight");
        }
        else if(result<0.4){
            System.out.println("underweight");
        }
        else{
            System.out.println("overweight");
        }
    }
}
