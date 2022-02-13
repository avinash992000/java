// You are using Java
import java.util.Scanner;

class Console{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        //System.out.println(name);
        if("King".equals(name)){
            System.out.println("You are the chief");
        }
        else if(name.equals("Anil") || name.equals("Geeta")){
            System.out.println("You are a manager");
        }
        else if(name.equals("Anjali")){
            System.out.println("You are HR");
        }
    }
}
