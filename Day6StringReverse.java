// You are using Java
import java.util.Scanner;

class ReverseString{
    
    public static String reverseStr(String str){
        StringBuffer st = new StringBuffer(str);
        //StringBuilder st = new StringBuilder(str);
        st.reverse();
        return st.toString();
    }


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(reverseStr(s1)+reverseStr(s2));
    }
}
