package Assignment8;

public class factorialOfNumber {
	
	static int calc_factorial(int num)
	{
		int result;
		if(num==1){
			return 1;
		}
		result= calc_factorial(num-1)* num;
			return result;
	}
	
	public static void main(String args[])
	{
	
	int number = 5;
	int factorial = calc_factorial(number);
	System.out.println("Factorial is: "+factorial);
	}
}
