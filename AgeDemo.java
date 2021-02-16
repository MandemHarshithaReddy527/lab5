package com.cg.age;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeException extends Exception {
	private String msg;

	public AgeException(String msg) {
		this.msg=msg;
		
 }
	public String toString() {
		return msg;
	}
 
}
public class AgeDemo {
 
 public static void main(String[] args) {
  @SuppressWarnings("resource")
Scanner s = new Scanner(System.in);
  System.out.print("Enter the age : ");
  int age = s.nextInt();
  
  try {
   if(age > 15) 
    throw new AgeException("valid age");
   else
    System.out.println("InValid age");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}
