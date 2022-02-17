
package day6;
public class School {
static final String name = "SRM University";
class Student1{
public void Access() {
School s1 = new School();
System.out.println("Student1 from "+s1.name);
}
}
class Student2{
public void Access() {
School s1 = new School();
System.out.println("Student2 from "+s1.name);
}
}
class Student3{
public void Access() {
School s1 = new School();
System.out.println("Student3 from "+s1.name);
}
}
}
package day6;
public class SchoolDriver {
public static void main(String[] args) {
School.Student1 s1 = new School().new Student1();
s1.Access();
School.Student2 s2 = new School().new Student2();
s2.Access();
School.Student3 s3 = new School().new Student3();
s3.Access();
}
}
