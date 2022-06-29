package java.AdvancedJava;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
class Student{
    private String name;
    private String id;
    private String email;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
public class JavaReflectionAttributesEasyProblem {
    public static void main(String[] args) {
        Class<Student> student = Student.class; // uses class literal, not a function.
        Method[] methods = student.getDeclaredMethods();

        /* Get names from Methods */
        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        /* Sort and print names */
        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
        Student s=new Student();
        s.setName("Shilpa");
        s.setId("1");
        s.setEmail("rs@gmail.com");
        System.out.println("Student info -");
        System.out.println("----------------");
        System.out.println(" Id: "+s.getId() +"\n" +" Name: "+s.getName() +"\n" +" Email: "+s.getEmail());
    }
}
