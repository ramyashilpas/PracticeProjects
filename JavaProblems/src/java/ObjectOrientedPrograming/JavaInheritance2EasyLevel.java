package java.ObjectOrientedPrograming;


class Arithmetic{
   int add(int a,int b){
       int sum;
       sum=a+b;
       return sum;
   }
}
class Adder extends Arithmetic{

}
public class JavaInheritance2EasyLevel {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My super class is" +a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}