package com.bridgelabz.day5_basic;
import java.util.Scanner;

public class SwapNumbers 
{

	public static void main(String[] args) 
	{
		int x,y;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int X = reader.nextInt();
		System.out.println("Enter the value of y : ");
		int Y = reader.nextInt();
		
		System.out.println("Before Swap...........");
		System.out.println("Value of x : "+X);
		System.out.println("value of y : "+Y);
		
		X=X-Y;
		Y=X+Y;
		X=Y-X;
		
		System.out.println("After Swap............");
		System.out.println("Value of x : "+X);
		System.out.println("Value of y : "+Y);	
	}
}
