package java.AdvancedJava;

import java.util.*;

class Singleton {

     private Singleton() {
     }
    public String str="Hello Iam Singleton! Let me say hello world to you";
     private static Singleton singleton;

    static Singleton getSingleInstance(){
         if(singleton==null)
             singleton= new Singleton();
         return singleton;
     }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String inp=sc.nextLine();
         System.out.println(inp);
         Singleton.getSingleInstance();
         System.out.println(singleton.str);
     }
 }
