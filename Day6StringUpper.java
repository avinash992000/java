// You are using Java
import java.util.Scanner;

class Upper{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String str1 = s1.toUpperCase();
        int i = s1.length();
        while(i>0){
            System.out.print(str1);
            i--;
        }
    }
}
