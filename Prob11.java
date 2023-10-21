import java.util.Scanner;
//11:Check if number is a prime number or not.

public class Prob11 {

	public static void main(String[] args) 
	{
		int num;
		boolean flag = false;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				flag = false;
				break;
			}
			else
			{
				flag = true;
			}
		}
		if(flag)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
		sc.close();

	}

}
