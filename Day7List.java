// You are using Java
import java.util.*;
class list{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //List<String> l1 = new ArrayList<>();
        Map<Integer, String> l1 = new HashMap<>();
        int i=0;
        while(n>0){
            i++;
            //String str = sc.nextLine();
            //List<String> l1 = new ArrayList<>();
            l1.put(i,sc.next());n--;
        }
        //Set<String> S1 = new HashSet<String>();
        System.out.println("How many names you want to enter in the list : Enter names for the list : ");
        System.out.println("Elements available in the list are : "+l1.values()+"\nEntry for set to the list : You can not modify the list.");
    }
}
