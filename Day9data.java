class DataLarge extends Exception {
    protected String data;
    
    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String getMessage() {
        return "large: " + data;
    }
}

class DataTooLarge extends DataLarge {
    @Override
    public String getMessage() {
        return "too large: " + data.substring(0,5);
    }
}

class MyData {
    public static void verify(String line) throws DataLarge, DataTooLarge {
        int n = line.length();
        if (n < 10) {
            System.out.println("OK");
        } else if (n < 15) {
            DataLarge ex = new DataLarge();
            ex.setData(line);
            throw ex;
        } else {
            DataTooLarge ex = new DataTooLarge();
            ex.setData(line);
            throw ex;
        }
    }
}


// You are using Java
import java.util.Scanner;

class Check{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        if(str.length()<15 && str.length()>9){
            try{MyData.verify(str);}
            catch(Exception e){
                String s1 = e.getMessage();
                System.out.println(s1.toLowerCase());
            }
        }
        else if(str.length()>14){
            try{MyData.verify(str);}
            catch(Exception e){
                System.out.println(e.getMessage().toUpperCase());
            }
        }
        else{
            try{MyData.verify(str);}
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
