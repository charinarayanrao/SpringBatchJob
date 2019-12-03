package com.job.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class TestClient {
   
 public static void main(String[] args)
 {
  ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/job/test/applicationContext.xml"); 
 }
  
}
