package csd;


class App{
	
  public static void main(String [] args) {
	  
	  java.util.Scanner kb = new java.util.Scanner(System.in);
	  
	  System.out.println("Please give an birthday:");
	  int birthyear = Integer.parseInt(kb.nextLine());
	  
	  System.out.println("Which year's age :");
	  int year = Integer.parseInt(kb.nextLine());
	  
	  int result = year - birthyear;
	  
	  System.out.printf("You will be %d age at % d year", result, year);
	  
	  
	  
	  
	  
	  
	  
  }
	
	
}