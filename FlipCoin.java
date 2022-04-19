package com.bridgelabz.day5_basic;
import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args)
	{
		int n,h_cnt=0, t_cnt=0;
		double tails , heads;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the no of times to filp the coin : ");
		int N = reader.nextInt();
		
		for (int j = 0; j < N; j++) 
		{
			double random = Math.random();
			if (random < 0.5)
				t_cnt++;
			else
				h_cnt++;
		}

		heads = h_cnt / (double) N * 100;
		tails = t_cnt / (double) N * 100;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");
				
	}

}
