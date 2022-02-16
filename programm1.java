package day5;
public class EmployeeDay5 {
private float Salary;
public float getSalary() {
return Salary;
}
public void setSalary(float salary) {
Salary = salary;
}
}
package day5;
public class ProgrammerDay5 extends EmployeeDay5 {
private int bonus;
private float total_salary;
public int getBonus() {
return bonus;
}
public void setBonus(int bonus) {
this.bonus = bonus;
}
public float getTotal_salary() {
total_salary = getSalary()+getBonus();
return total_salary;
}
public void displayTotalSalary() {
System.out.println(getTotal_salary());
}
}
package day5;
public class ProgrammerDay5Driver {
public static void main(String[] args) {
ProgrammerDay5 p1 = new ProgrammerDay5();
p1.setSalary(250000);
p1.setBonus(25000);
p1.displayTotalSalary();
}
}
