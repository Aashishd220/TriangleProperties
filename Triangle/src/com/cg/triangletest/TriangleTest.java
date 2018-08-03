package com.cg.triangletest;

//Creates number of triangles and checks triangle properties

import java.util.*;

import com.cg.triangle.Triangle;

public class TriangleTest {

	public static void main(String args[]) {

		Scanner get = new Scanner(System.in);
		System.out.println("Enter the number of triangles");
		int number_of_trinagles = get.nextInt();
		// array of objects
		Triangle triangle_check[] = new Triangle[number_of_trinagles];

		// taking input for sides of triangle
		for (int i = 0; i < number_of_trinagles; i++) {
			triangle_check[i] = new Triangle();
			System.out.println("Enter sides of " + (i + 1) + " triangle");
			int side1 = get.nextInt();
			triangle_check[i].setSide1(side1);

			int side2 = get.nextInt();
			triangle_check[i].setSide2(side2);

			int side3 = get.nextInt();
			triangle_check[i].setSide3(side3);
		}
//printing properties of triangle
		for (int i = 0; i < number_of_trinagles; i++) {
			System.out.println("Properties of triangle " + (i + 1) + "\n");
			System.out
					.println("Is this triangle Scalene? \n" + triangle_check[i].isScalene(triangle_check[i].getSide1(),
							triangle_check[i].getSide2(), triangle_check[i].getSide3()));
			System.out.println("Is this triangle Isosceles? \n" + triangle_check[i].isIsosceles(
					triangle_check[i].getSide1(), triangle_check[i].getSide2(), triangle_check[i].getSide3()));
			System.out.println("Is this triangle Equilateral? \n" + triangle_check[i].isEquilateral(
					triangle_check[i].getSide1(), triangle_check[i].getSide2(), triangle_check[i].getSide3()));
			System.out.println("Is this triangle Right? \n" + triangle_check[i].isRight(triangle_check[i].getSide1(),
					triangle_check[i].getSide2(), triangle_check[i].getSide3()));
		}
		get.close();
	}
}
