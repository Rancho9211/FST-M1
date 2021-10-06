package activities;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int num=sc.nextInt();
		
		//Logic 1 -using Algo
		
	/*	int rev=0;
				
				while(num!=0)
					
				{
					rev=rev*10 + num%10;
					num=num/10;
				}
		*/
		
		//Logic 2
		
		/*	StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		*/
		
		//logic 3
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		
		System.out.println("Reverse number is:" +rev);
	}

}
