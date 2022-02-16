package day5;
public class AnimalDay4 {
private String name;
private String name1;
AnimalDay4(){
}
AnimalDay4(String name,String name1) {
this.name=name;
this.name1=name1;
}
public void displayanimal() {
System.out.print("animal name: "+name+"animal name1"+name1);
}
}
package day4;
public class MammalDay4 extends AnimalDay4{
public String name3;
MammalDay4(String name,String name1,String name3) {
super(name,name1);
this.name3=name3;
}
MammalDay4(){
}
public void display() {
displayanimal();
System.out.println("animal name3"+name3);
}
}
package day4;
public class MammalDriver{
public static void main(String[] args) {
MammalDay4 m1 = new MammalDay4("lion", "tiger", "goat");
m1.display();
}
}
