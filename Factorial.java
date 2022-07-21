import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		int value;
		System.out.println("factor of "+ num + " is ");
		for (value = 2; value * value <= num; value++) {
			while(num % value == 0) {
				System.out.print(value + " ");
				num = num/value;
			}
		}

	}

}
