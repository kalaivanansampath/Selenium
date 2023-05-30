package com.BasicPrograms;

public class Star {

	public static void main(String[] args) {
		int row = 5, i, j;

		System.out.println(5 % 2);

		for (i = 0; i < row; i++) {
			if (i % 2 == 0) {
				for (int space = 0; space < i; space++)
					System.out.print(" ");
				for (j = i; j < row; j++)
					System.out.print("* ");
				System.out.print("\n");
			}
		}
	}
}

//for(i=0; i<row; i++)
//{
//   for(int space=i; space<row; space++)
//      System.out.print(" ");
//   for(j=0; j<=i; j++)
//      System.out.print("* ");
//   System.out.print("\n");
//}
//}