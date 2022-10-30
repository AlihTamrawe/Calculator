package axsos.java.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestCalculator {
	
	public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
	 
	        // Reading data using readLine
	        
		
		Calculator cal1 = new Calculator();
		System.out.println(" enter first number :");
		double num1 =Double.parseDouble( reader.readLine()) ;
		
		cal1.setOperandone(num1);
		System.out.println(" enter Opreation Symbol :");
		Scanner sym = new Scanner(System.in);
		cal1.setOperation(sym.next().charAt(0));

		System.out.println(" enter first number :");
		String num2 =  new String();
		num2= reader.readLine();
		cal1.setOperandTwo(Integer.parseInt(num2));
		cal1.performOperation();
		System.out.println( "The result is :"+cal1.getResults());
		
		
		    
	
		    
		
	}

}
