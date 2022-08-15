import java.util.Scanner;

public class DecToHexApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		BackEnd be = new BackEnd();
		
		System.out.println("----------------------------------------" + "\n" +
				"Enter 1 to convert from decimal to hexadecimal :" + "\n" + 
				"Enter 2 to convert from decimal to binary : " + "\n" + 
				"Enter 3 to convert from binary to decimal :");
		input = scan.nextInt();
		
		switch(input) {
		case 1:
			be.decToHex(0);
			break;
			
		case 2:
			be.decToBin(0);
			break;
			
		case 3:
			be.binToDec("");
			break;
		}
	
		
				
	}

}
