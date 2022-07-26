
package csd;

class App {
	public static void main(String [] args)
	{		
		System.out.println("The functions are not called yet...");
		Function.firstfunction();
		Function.secondfunction();
		Foo.foofunction();
		System.out.println("All functions were called");
		
	}
}


 class Function {
	 
	 public static void firstfunction() {
		 
		 System.out.println("First function was called..");
		 
	 }
	 
	 public static void secondfunction() {
		 
		 System.out.println("Second function was called");
		 firstfunction();
	 }
	 
	 
	 
	 
 }

 class Foo {
	 
	 public static void foofunction() {
		 
		 System.out.println("Foo function was called");
	 }
 }
 
 
 
 
 
 
 
 