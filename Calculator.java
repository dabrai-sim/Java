class Calculator{
        public double addition(double firstNumber, double secondNumber){
		    return firstNumber + secondNumber;  
		}
		public double subtraction(double firstNumber, double secondNumber){
			return firstNumber + secondNumber;
		}
		public double multiplication(double firstNumber, double secondNumber){
			return firstNumber * secondNumber;
		}
		public double division(double firstNumber, double secondNumber){
			return firstNumber / secondNumber;
		}
		public double sumOfArray(double[] array){
			double sum = 0;
            for (double element : array) {
                sum += element;
            }
			return sum;
		}
		public static double variance(double[] array ){
			// Calculate the mean
            double sum = 0;
            for (double element : array) {
                sum += element;
            }
            double mean = sum / array.length;

            // Calculate the sum of squared differences
            double sumSquaredDifferences = 0;
            for (double element : array) {
                sumSquaredDifferences += Math.pow(element - mean, 2);
            }
			// Calculate the variance
            double variance = sumSquaredDifferences / array.length;
			return variance;			
		}
		public double standardDeviation(double[] array){
			
			double variance = Calculator.variance(array);
			double standardDeviation = Math.sqrt(variance);
			return standardDeviation;		
		}
}