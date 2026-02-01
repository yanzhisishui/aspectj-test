package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        //-javaagent:C:\Users\14812\.m2\repository\org\aspectj\aspectjweaver\1.9.25\aspectjweaver-1.9.25.jar
        UserService us = new UserService();
        us.test1();
        System.out.println(us.getClass());

        Thread.sleep(5000000);
//        us.setName("Jack");
//        String name = us.getName();
//        System.out.println(name);
    }
}
