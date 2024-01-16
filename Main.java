// Simrann Dabrai 22070126111 B2
import java.util.Scanner;
class Main{
        public static void main(String args[]){
			
			Scanner scan = new Scanner(System.in);
			UserInput input = new UserInput();
		    Calculator calculator = new Calculator();
			double[] numbers = new double[2];

            while (true) {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sum of array");
			System.out.println("6. Variance of array");
			System.out.println("7. Standard Deviation of array");
			System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            // Prompt the user to enter an integer
            System.out.print("Enter Choice: ");
            // Check if the next input is an integer
            int choice = scan.nextInt();
			
			switch(choice){
				case 1:
				    
				    numbers = input.inputNumbers();
				    System.out.println("The addition of"+numbers[0]+"and"+numbers[1]+"is"+calculator.addition(numbers[0],numbers[1]));
					
				case 2:
				    
				    numbers = input.inputNumbers();
				    System.out.println("The subtraction of"+numbers[0]+"and"+numbers[1]+"is"+calculator.subtraction(numbers[0],numbers[1]));
				
				case 3:
				    
				    numbers = input.inputNumbers();
				    System.out.println("The multiplication of"+numbers[0]+"and"+numbers[1]+"is"+calculator.multiplication(numbers[0],numbers[1]));
				
				case 4:
				    
				    numbers = input.inputNumbers();
				    System.out.println("The division of"+numbers[0]+"and"+numbers[1]+"is"+calculator.division(numbers[0],numbers[1]));
				
				case 5:
				    System.out.print("Enter the size of array: ");
					int size = scan.nextInt();
					// Create an array of the specified size
					double[] array = new double[size];
					// Call the function to get user input for the array elements
					array = input.getUserInput(array);
					
					System.out.println("The sum of array is"+calculator.sumOfArray(array));
                
                case 6:
				    System.out.print("Enter the size of array: ");
					int size1 = scan.nextInt();
					// Create an array of the specified size
					double[] array1 = new double[size1];
					// Call the function to get user input for the array elements
					array1 = input.getUserInput(array1);
					
					System.out.println("The sum of array is"+calculator.variance(array1));	

                case 7:
				    System.out.print("Enter the size of array: ");
					int size2 = scan.nextInt();
					// Create an array of the specified size
					double[] array2 = new double[size2];
					// Call the function to get user input for the array elements
					array2 = input.getUserInput(array2);
					
					System.out.println("The sum of array is"+calculator.standardDeviation(array2));					
				    
				case 8:
				    System.out.println("Exiting calculator program. Goodbye!");
                    break;			
			}		        
		}
		}
}