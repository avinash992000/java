// header
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String part = sc.nextLine();
        sc.close();
        SparePartsStore store = new SparePartsStore(Arrays.asList(new String[]{"A", "B", "C"}));
        try {
            store.search(part);
        } catch (PartNotFoundException ex) {
            System.out.println("NOT FOUND");
        } finally {
            System.out.println("Done");
        }
    }
}

// You are using Java
//import java.util.*;

class SparePartsStore{
    
    
    SparePartsStore(List<?> list){
        
    }
    
    
    public void search(String s) throws PartNotFoundException{
            
            if( s.equals("A") || s.equals("B") || s.equals("C")){
            }
                
            else{throw new PartNotFoundException();
            }
    }
}

class PartNotFoundException extends Exception{
    PartNotFoundException(){
        super();
    }
    PartNotFoundException(String str){
        super(str);
    }
    @Override
    public String toString(){
        return super.toString();
    }
    @Override
    public String  getMessage(){
        return super.getMessage();
    }
    
}
