// You are using Java
import java.util.Scanner;
import java.util.Arrays;

class Friends{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arr[]= new String[3];
        int i=0;
        while(i<3){
            arr[i++]=sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
