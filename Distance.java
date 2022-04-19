package com.bridgelabz.day5_basic;

import java.util.Scanner;

public class Distance 
{
	static void calculate(int x, int y) 
	{
		System.out.println("Distance is " + Math.pow((x * x + y * y), 1.0));
	}

	public static void main(String[] args)
	{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value for x & y");
			int x = s.nextInt();
			int y = s.nextInt();
			calculate(x, y);
	}
}
