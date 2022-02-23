class Student {
    public void attend(String name) throws Exception {
        if (name.length() < 8) {
            throw new Exception("SHORT");
        } else if (name.length() > 18) {
            throw new Exception("LONG");
        }
        System.out.println(name);
    }
}

// You are using Java
import java.util.Scanner;
class Catchit{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        Student s = new Student();
            try{s.attend(str);}
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
    }
}
