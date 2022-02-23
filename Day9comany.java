import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        n = (n*n+2*n*n*n+15)%40;
        Company company = new Company();
        try {
            company.check(n);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println(n);
        }
    }
}

// You are using Java
class Company{
    
    
    public void check(int n) throws Exception{
        if(n<5){
            throw new Exception("SMALL");
        }
        else if(n>20){
            throw new Exception("LARGE");
        }
    }
}
