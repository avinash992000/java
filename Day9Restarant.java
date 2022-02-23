Name: Nadipalli Veera Venkata Avinash
package day10;
public class DishNotAvailable extends Exception{
public DishNotAvailable() {
super();
}
public DishNotAvailable(String str) {
super(str);
}
@Override
public String getMessage() {
// TODO Auto-generated method stub
return super.getMessage();
}
@Override
public String toString() {
// TODO Auto-generated method stub
return super.toString();
}
}
package day10;
public class RestarantDemo {
public void order(String dish) throws DishNotAvailable{
double n = Math.random();
if(n>0.5) {
System.out.println(dish+"Found");
}
else {
throw new DishNotAvailable("NOT FOUND");
}
}
public static void main(String[] args){
try {
RestarantDemo rd = new RestarantDemo();
rd.order("Masala Dosa");
}catch(DishNotAvailable e) {
e.printStackTrace();
}finally {
System.out.println("Bye");
}
}
}
