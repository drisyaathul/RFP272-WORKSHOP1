//Java Code to find the number of digits in an integer

public class NumberOfDigit{

public static void main (String [] args ){

int number = 589642;
int count = 0;

while (number != 0) {

	number = number / 10;
	count ++;
}
	System.out.println("Number of digits = " +count);
}
}