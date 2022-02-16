package day5;
public class StudentDay4 {
private int id;
private String name;
public void Values(int id,String name) {
this.id = id;
this.name = name;
}
public void display() {
System.out.println("id: "+id+"name: "+name);
}
}
package day5;
public class StudentDriver {
public static void main(String[] args) {
StudentDay4 Std1 = new StudentDay4();
Std1.Values(1, "Avinash");
Std1.display();
}
}
