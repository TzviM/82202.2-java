package e.loops;

import java.util.Scanner;

public class DemoFor6Boom {

	public static void main(String[] args) {
		// input 2 numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd number: ");
		int b = sc.nextInt();
		sc.close(); // close the scanner (save system resources)
		// make sure a is smaller
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		// print a and b
		System.out.println(a + " - " + b);

		// print a to b ---> as 7 Boom
		for (int i = a; i <= b; i++) {
			// add some more logic here:
			//
			//
			System.out.println(i);
		}

	}

}
