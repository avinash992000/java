// You are using Java
import java.util.Scanner;

class garments{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int shirts = sc.nextInt();
        int Trousers = sc.nextInt();
        double discount = 0.1*((shirts*300)+(Trousers*700));
        double total = ((shirts*300)+(Trousers*700))-discount;
        double points = (0.01*total);
        System.out.println("Enter the number of Shirts to order:\nEnter the number of Trousers to order:\n\nItem 		 Quantity 	  Price 	  Total\n-------------------------------------------------------------\nShirts 		 "+shirts+" 		  300 		  "+shirts*300+" \nTrousers 	 "+Trousers+" 		  700 		  "+Trousers*700+" \nDiscount 	  		  		  "+String.format("%.2f",discount)+" \n-------------------------------------------------------------\nNet Total 	  		  		  "+String.format("%.2f",total)+" \n-------------------------------------------------------------\nPoints Earned 	  "+String.format("%.0f",points)+" \nThank you!");
    }
}
