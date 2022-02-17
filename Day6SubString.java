import java.util.Scanner;
class SubString{
    
    public static String reverse(String str){
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        return st.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String rev = reverse(s1);
        int n = s1.length();
        int len = rev.substring(n/2,n).length();
        System.out.println(len);
        //while(len<)
        
        
    }
}
