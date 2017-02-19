package cMain;

import java.util.Scanner;

public class Rating 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double TD, Yards, INT, comp, ATT, a, b, c, d, rating;
		System.out.println("Enter collects touchdowns");
		TD = in.nextDouble();
		System.out.println("Enter total yards");
		Yards = in.nextDouble();
		System.out.println("Enter Interceptions");
		INT = in.nextDouble();
		System.out.println("Enter completions");
		comp = in.nextDouble();
		System.out.println("Enter number of passes attempted");
		ATT = in.nextDouble();
		a = (comp / ATT - 0.3) * 5;
		b = (Yards / ATT - 3) * 0.25;
		c = (TD / ATT) * 20;
		d = 2.375 - (INT / ATT * 25);
		rating = (a + b + c + d) / 6 * 100;
		
		if (rating > 158.3)
		{
			System.out.println("The rating of this passer is 158.3");
		}
		else
		{
			System.out.println("The rating of this passer is " + rating);
		}
	}
}
