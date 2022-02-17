class Outer {
    class Inner {
     
        public void describe(String name) {
            System.out.println(name + " "+name.length());
        }
    }
}

// You are using Java
import java.util.Scanner;

class print{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Outer.Inner O1 = new Outer().new Inner();
        O1.describe(str);
        
    }
    
}
