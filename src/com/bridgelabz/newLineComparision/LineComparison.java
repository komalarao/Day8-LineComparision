package com.bridgelabz.newLineComparision;
import java.util.Scanner;
	public class LineComparison {
		
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Value X1 X2 X3 X4");
			int x1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int x3 = scanner.nextInt();
			int x4 = scanner.nextInt();
			System.out.println("Enter Value Y1 Y2 Y3 Y4");
			int y1 = scanner.nextInt();
			int y2 = scanner.nextInt();
			int y3 = scanner.nextInt();
			int y4 = scanner.nextInt();
			double length1;
			double length2;

			length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			System.out.println("Length Of line1: " + length1);
			length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
			System.out.println("Length Of Line2: " + length2);

			// Checking condition equality
			if (length1 == length2) {
				System.out.println("Both Length Are Equal");
			} else {
				System.out.println("Not Equal");
			}

		}
}
