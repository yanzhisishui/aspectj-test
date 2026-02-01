package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserServiceAspect {

    @Before("execution(* com.example.UserService.test1())")
    public void before(){
        System.out.println("before test1!");
    }

    // 1. 拦截 User.name 字段的读取
    @Before("get(private String com.example.UserService.name)")
    public void beforeReadName(JoinPoint jp) {
        System.out.println("【字段读】正在读取 User.name 字段");
        System.out.println("  目标对象: " + jp.getTarget());
        System.out.println("  在类中: " + jp.getSourceLocation());
    }

    // 1. 拦截 User.name 字段的读取
    @Before("set(private String com.example.UserService.name)")
    public void beforeSetName(JoinPoint jp) {
        System.out.println("【字段读】正在设置 User.name 字段");
        System.out.println("  目标对象: " + jp.getTarget());
        System.out.println("  在类中: " + jp.getSourceLocation());
    }
}
