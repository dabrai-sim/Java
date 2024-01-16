import java.io.*;
import java.util.*;

class UserInput{
        public double[] getUserInput(double[] arr) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr[i] = scanner.nextDouble();
            }
		    return arr;
    }
			public double[] inputNumbers(){
		        Scanner scan = new Scanner(System.in);
				System.out.println("Enter First Number:");
				double firstNumber = scan.nextDouble();
				
				System.out.println("Enter Second Number:");
				double secondNumber = scan.nextDouble();
				
				double[] numbers = new double[2];
				numbers[0] = firstNumber;
				numbers[1] = secondNumber;
				
				return numbers;
		    }
}