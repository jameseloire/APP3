import java.util.Scanner;

public class ProgPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decision = 0;
		
		
		while (decision != 6) {
			
			Scanner input = new Scanner(System.in);
			if (input.hasNextInt()) { // to have an Int as input

				decision = input.nextInt();
			
				if (decision == 1) { // Create an account
					
				
					System.out.println("Enter your surname here, please :");
					String sc_surname = input.next();

					System.out.println("\nThen I'll need your firstname :"); 
					String sc_firstName = input.next();
					
					
					System.out.println("\nThen I'll need your phone number :");
					if (input.hasNextInt()) { // to have an Int as input
						
						int sc_telephonenumber = input.nextInt();
					
					System.out.println("\nCan I have your salary ?");
					if (input.hasNextFloat()) { // to have an Float as input

						float sc_salary = input.nextFloat();
									}
				
				else {
				System.out.println("(6) Exit the program.");
				}}
					else {

						System.out.println("\nError...Response not expected.\n");
					

					}

				
	}

			
			
			 }
			
		else {
							System.out.println("(6) Exit the program.");
						}
			
				} else {

				System.out.println("\nError...Response not expected.\n");
		

			}
			 
		}		
	}
}