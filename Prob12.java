import java.util.Scanner;
//12:Sum of series :
//1+2+3+….+n

public class Prob12 {

	public static void main(String[] args) 
	{
		int num, res = 0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			res = res + i;
		}
		System.out.println("Sum = "+res);
	}

}
