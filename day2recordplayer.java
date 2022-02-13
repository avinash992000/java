// You are using Java
import java.util.Scanner;

class RecordPlayer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String status = sc.nextLine();
        if(status.equals("STOPPED") || status.equals("PAUSED")){
            System.out.println("0");
        }
        else if(status.equals("PLAYING") || status.equals("RECORDING")){
            System.out.println("1");
        }
        else{
            System.out.println("2");
        }
    }
}
