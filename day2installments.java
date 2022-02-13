// You are using Java
import java.util.Scanner;

class Installements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Amount= sc.nextInt();
        int duration=sc.nextInt();
        int Selected=sc.nextInt();
        String Plan="Sample";
        double installment = 0;
        System.out.println("Enter the amount you want to insure for: $");
        System.out.println("Enter the number of years you want to insure for:");
        System.out.println("The following plans are available. Enter your choice:\n"+" 1. Monthly \n"+" 2. Half-Yearly \n"+" 3. Yearly\n");
        System.out.println("Policy Details:\n"+"Insurance Amount: 		 $"+Amount+" \n"+"Insurance duration (years): 	 "+duration+"  ");
        switch(Selected){
            case 1:
                Plan="Monthly ";
                installment = (Amount/(duration-2))/12;
                break;
            case 2:
                Plan=" Half-Yearly ";
                break;
            case 3:
                Plan=" Yearly";
        }
        System.out.println("Insurance Plan: 		 "+Plan+"\n");
        System.out.println("Installment : 			 $"+String.format("%.2f",installment));
        
    }
}
