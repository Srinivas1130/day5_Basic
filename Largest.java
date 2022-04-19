package com.bridgelabz.day5_basic;
import java.util.Scanner;

public class Largest 
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter the value of n1 : ");
		int num1 = reader.nextInt();
		System.out.println("Enter the value of n2 : ");
		int num2 = reader.nextInt();
		System.out.println("Enter the value of n3 : ");
		int num3 = reader.nextInt();
		
		if(num1>num2 && num1>num3) 
		{
			System.out.println("Num1 is the Largest ");	
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("Num2 is the Largest");
		}
		else
		{
			System.out.println("Num3 is the Largest");
		}
	}
}
