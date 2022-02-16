Name: Nadipalli Veera Venkata Avinash
package day5;
public class PersonDay5 {
private int Id;
private String name;
public PersonDay5(int id,String name) {
this.Id = id;
this.name = name;
}
PersonDay5(){
}
void displayPerson() {
System.out.print("Id: "+Id+"name: "+name+" ");
}
}
package day5;
public class EmpDay5 extends PersonDay5 {
private double Salary;
EmpDay5(int Id,String name,double Salary) {
super(Id,name);
this.Salary = Salary;
}
public void display() {
displayPerson();
System.out.println("salary: "+Salary);
}
}
package day5;
public class EmpDay5Driver {
public static void main(String[] args) {
EmpDay5 E1 = new EmpDay5(1,"Avinash", 250000);
E1.display();
}
}
