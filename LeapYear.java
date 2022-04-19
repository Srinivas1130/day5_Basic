package com.bridgelabz.day5_basic;
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		int yr;
		boolean leap=false;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = reader.nextInt();
		
		if(year %4 == 0 && year % 100== 0 && year % 400 == 0)
		{
			leap=true;
			System.out.println("The year is leap year");	
		}
		else
		{
			leap=false;
			System.out.println("The year is not leap year");
		}
	}
}
