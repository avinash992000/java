// You are using Java
import java.util.Scanner;
import java.util.Arrays;

class Median{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Float Arr[]= new Float[3];
        int i=0;
        while(i<3){
            Arr[i++]=sc.nextFloat();
        }
        Arrays.sort(Arr);
        System.out.println(Arr[1]);
    }
}
