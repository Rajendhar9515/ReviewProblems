import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before Swapping number " + x + " " + y);
		z = x;
		x = y;
		y = z;
		System.out.println("After Swapping " + x + " " + y);

	}

}
