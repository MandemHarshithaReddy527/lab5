package com.cg.eis.exception;

import java.util.Scanner;

class MyException extends Exception {
	 
	 String str1;
	 MyException(String str2){
		 str1=str2;
	 }
	 public String toString() {
		 return(str1);
	 }
	} 

public class EmployeeException {
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter your salary");
		  int salary = s.nextInt();
		  
		  try {
		   if(salary < 3000) 
		    throw new MyException("Low Salary");
		   else
		    System.out.println(salary);
		  }
		  catch (MyException a) {
		   System.out.println(a);
		  }
		 }

}