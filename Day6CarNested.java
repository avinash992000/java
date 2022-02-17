Name: Nadipalli Veera Venkata Avinash
package day6;
public class Car {
String make;
public String getMake() {
return make;
}
public void setMake(String make) {
this.make = make;
}
public void display() {
System.out.println("Car Brand:"+getMake());
}
class Wheel1{
String make;
public String getMake() {
return make;
}
public void setMake(String make) {
this.make = make;
}
public void display() {
System.out.println("Wheel1 Brand:"+getMake());
}
}
class Wheel2{
String make;
public String getMake() {
return make;
}
public void setMake(String make) {
this.make = make;
}
public void display() {
System.out.println("Wheel2 Brand:"+getMake());
}
}
class Wheel3{
String make;
public String getMake() {
return make;
}
public void setMake(String make) {
this.make = make;
}
public void display() {
System.out.println("Wheel3 Brand:"+getMake());
}
}
class Wheel4{
String make;
public String getMake() {
return make;
}
public void setMake(String make) {
this.make = make;
}
public void display() {
System.out.println("Wheel4 Brand:"+getMake());
}
}
}
package day6;
public class CarDriver {
public static void main(String[] args) {
Car c1 = new Car();
c1.setMake("Maruti");
c1.display();
Car.Wheel1 w1 = new Car().new Wheel1();
w1.setMake("MRF");
w1.display();
Car.Wheel2 w2 = new Car().new Wheel2();
w2.setMake("MRF");
w2.display();
Car.Wheel3 w3 = new Car().new Wheel3();
w3.setMake("MRF");
w3.display();
Car.Wheel4 w4 = new Car().new Wheel4();
w4.setMake("MRF");
w4.display();
}
}
