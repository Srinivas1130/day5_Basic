package com.bridgelabz.day5_basic;
import java.util.Scanner;

public class OuotientRemainder 
{

	public static void main (String[] args)
	{
		int dividend,divisor;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value of dividend : ");
		int Dividend = reader.nextInt();
		System.out.println("Enter the value of divisor : ");
		int Divisor = reader.nextInt();
		
		int Quotient = Dividend/Divisor;
		int Remainder = Dividend%Divisor;
		
		System.out.println("Qoutient : "+Quotient);
		System.out.println("Remainder : "+Remainder);
	}
}
