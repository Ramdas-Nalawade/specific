import java.util.Scanner;
//13:Check whether the number is palindrome or not?

public class Prob13 {

	public static void main(String[] args) 
	{
		int num, div, mod = 0, res = 0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 0; i < 5; i++)
		{
			mod = num % 10;
			res = res * 10 + mod;
			div = num / 10;
		}
		System.out.println("number is: "+res );

	}

}
