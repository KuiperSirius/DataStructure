public class FindMax {
	public static void main(String[] args) {
		int a[] = { 5, 8, 4, 2, 6 };
		int x = a[0];
		int i = 1;
		while (i < a.length) {
			if (a[i] > x)
				x = a[i];
			i = i + 1;
		}
		System.out.println("the max element is:" + x);
	}
}