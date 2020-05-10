package org.tutorials.javatutorials.datatype;

public class No03_Bool {

	public static void main(String[] args) {
		boolean isSuccess = true;
		boolean isTest = false;
		
		// ==
		System.out.println(1==2);           //false
        System.out.println(1==1);           //true
        System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
        
        // !=
        System.out.println(1!=2);           //true
        System.out.println(1!=1);           //false
        System.out.println("one"!="two");   //true  
        System.out.println("one"!="one");   //false
        
        // >
        System.out.println(10>20);       //false
        System.out.println(10>2);            //true
        System.out.println(10>10);           //false
        
        // >=
        System.out.println(10 >= 20); // false
        System.out.println(10 >= 2); // true
        System.out.println(10 >= 10); // true
        
        
	}

}
