import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Getbinary extends Thread
{
	int inputNumber;
	
	public void run()
	{
		int i=0,remainder=0,quo=0;
		int binaryArray[]= new int[10];
		while(inputNumber>0)
		{
					remainder=inputNumber%2;
					quo=inputNumber/2;
					if(remainder ==0 || remainder==1)
						binaryArray[i]=remainder;
					inputNumber=quo;
					
					i++;
		}
		
		for(int n=binaryArray.length-1;n>=0;n--)
			{
				System.out.print(binaryArray[n]);
			}
		
	}
}



class Print{
    public static void main(String[] args){
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter a decimal number:");
        
        try{
            int n = Integer.parseInt(br.readLine());
            System.out.print("It's binary form:");
            Getbinary t1 =new Getbinary();
            t1.inputNumber = n ;
            t1.start();
            
        }catch(IOException e){
            e.printStackTrace();
        }
            
    }
}
