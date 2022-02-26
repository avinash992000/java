// You are using Java
import java.util.Scanner;

class TThread extends Thread{
    
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        int mr1 = sc.nextInt();
        int mc1= sc.nextInt();
        int mr2=sc.nextInt();
        int mc2 = sc.nextInt();
        int arr[][] = new int[mr1][mc1];
        int arr2[][] = new int[mr1][mc1];
        int res[][] = new int [mr1][mc2];
        
        
        for(int i=0;i<mr1;i++){
            for(int j=0;j<mc1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<mr2;i++){
            for(int j=0;j<mc2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(mc1==mr2){
            for(int i=0;i<mr1;i++){
                for(int j=0;j<mc2;j++){
                    res[i][j]=0;
                    for(int k=0;k<mc1;k++){
                        res[i][j]+=arr[i][k]*arr2[k][j];
                    }
                }
            }
            for(int i=0;i<mr1;i++){
                for(int j=0;j<mc2;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
            
        }
    }
}

class Print{
    public static void main(String[] args){
        Thread t1 = new TThread();
        t1.start();
        
    }
}
