package basicprogram;

import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num,count=0,sum=0,rem,temp;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number to check armstrong number or not");
		num=sc.nextInt();
		
		//store actual number for future use
		temp=num;
		
		//count no of digits
		while(num>0)  //while (num!=0)
		{
			count++;
			num=num/10;
		}
		
		//again assign value from temp to number as number becomes zero
		num=temp;
		
		//calculate armstrong number
		while(num>0) //0>0f
		{
			rem=num%10;
			sum+=Math.pow(rem, count); //1*1*1=1   152+1=153
			num=num/10;
		}
		
		//checking actual number is matched with sum or not
		if(sum==temp)
			System.out.println(temp+ " is an Armstrong Number");
		else
			System.out.println(temp+ " is not an Armstrong Number");	

	}

}
