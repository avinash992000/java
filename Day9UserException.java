
package day10;
public class ExceptionA extends Exception{
ExceptionA(){
super();
}
ExceptionA(String str){
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
class ExceptionB extends ExceptionA {
ExceptionB(){
super();
}
ExceptionB(String str){
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
class ExceptionC extends ExceptionB{
ExceptionC(){
super();
}
ExceptionC(String str){
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
public class ExceptionDriver extends Exception{
public static void main(String[] args) {
int[] arr = {1,2,3};
try{
check(arr);
}
catch(ExceptionA e) {
System.out.println(e.getMessage());
}finally {
System.out.println("Done");
}
}
public static void check(int[] arr) throws ExceptionA{
for(int i:arr) {
if(i==1) {
throw new ExceptionA("ExceptionA thrown");
}
else if(i==2) {
throw new ExceptionB("ExceptionB thrown");
}
else if(i==3) {
throw new ExceptionC("ExceptionC thrown");
}
}
}
}
