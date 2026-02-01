///*
//        * Decompiled with CFR.
//        *
//        * Could not load the following classes:
//        *  com.example.UserServiceAspect
//        */
//       package com.example;
//
//       import org.aspectj.lang.JoinPoint;
//       import org.aspectj.lang.Signature;
//       import org.aspectj.runtime.reflect.Factory;
//
//       public class UserService {
//           private String name;
//           private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
//           private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
//
//           public String getName() {
///* 9*/         UserService userService = this;
//               JoinPoint joinPoint = Factory.makeJP(ajc$tjp_0, this, userService);
//               UserServiceAspect.aspectOf().beforeReadName(joinPoint);
//               return userService.name;
//           }
//
//           static {
///* 1*/         UserService.ajc$preClinit();
//           }
//
//           public void setName(String name) {
//               String string = name;
//               UserService userService = this;
//               JoinPoint joinPoint = Factory.makeJP(ajc$tjp_1, (Object)this, (Object)userService, string);
//               UserServiceAspect.aspectOf().beforeSetName(joinPoint);
//               userService.name = string;
//           }
//
//           public void test1() {
///*17*/         UserServiceAspect.aspectOf().before();
//               System.out.println("test1 started!");
//           }
//
//           private static /* synthetic */ void ajc$preClinit() {
//               Factory factory = new Factory("com/example/UserServiceArthas.java", UserService.class);
//               ajc$tjp_0 = factory.makeSJP("field-get", (Signature)factory.makeFieldSig("2", "name", "com.example.UserService", "java.lang.String"), 9);
//               ajc$tjp_1 = factory.makeSJP("field-set", (Signature)factory.makeFieldSig("2", "name", "com.example.UserService", "java.lang.String"), 13);
//           }
//       }