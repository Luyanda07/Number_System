import java.util.Scanner;

public class BackEnd {
	//The user input
	private int userInput;
	
	/**
	 * The constructor initializes the product
	 * @param userInput
	 */
	
	public BackEnd(int userInput) {
	
		this.userInput = userInput;
		
	}
	
	public BackEnd() {
		userInput = 0;
		
	}
	
	/**
	 * This method returns the user input
	 * @return The user input
	 */

	public double getNumber() {
		return userInput;
	}
	
	
	/**
	 * This method converts a decimal number to a Hexadecimal number 
	 * @param userInput
	 */
	
	public void decToHex(int userInput) {
		
		 userInput = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the decimal number you would like convert to Hexadecimal: ");
		userInput = input.nextInt();
		while(userInput > 10000 || userInput < 0) {
			System.out.println("Invalid number please try again: ");
			userInput = input.nextInt();
				
		}
		
		System.out.println("The base 16 of "+ userInput + " is " + Integer.toHexString(userInput));
	}
	
	/**
	 * This method converts a decimal number to a binary number 
	 * @param userInput
	 */
	
	public void decToBin(int userInput) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the decimal number you would like convert to binary: ");
		userInput = scan.nextInt();
		while(userInput > 10000 || userInput < 0) {
			System.out.println("Invalid number please try again: ");
			userInput = scan.nextInt();
		}
		System.out.println("The base 2 of "+ userInput + " is " + Integer.toBinaryString(userInput));
		
	}
	
	/**
	 * This method converts a binary number to a decimal number 
	 * @param userInput
	 */
	
   public void binToDec(String userInput) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the binary number you would like convert to a decimal: ");
		userInput = key.nextLine();
		
		System.out.println("The base 10 of "+ userInput + " is " + Integer.parseInt(userInput, 2));
   }
	
	
	
	

}
