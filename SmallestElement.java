import java.util.Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int a[] = { 4, 3, 6, 2, 9, 4,7 };
		System.out.println("Smallest Number " + getSmallestNum(a, 7));

	}

	public static int getSmallestNum(int[] a, int total) {
		Arrays.sort(a);
		return a[0];
	}
}
