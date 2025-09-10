package module1._3expressions;

public class E06TestCompound {
	//Exercise 6: Predict what will print before running the program.
	//Be sure to remember your order of operations!
	public static void main(String[] args) {
		System.out.println(2 + 3 * 2);
		System.out.println((2 + 3) * 2);
		System.out.println(2 + (3 * 2));

		int a = 5;
		int b = 2;
		double c = 3.0;
		System.out.println (5+ a/b * c-1);

	}
}
//8, 10, 8