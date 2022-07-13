package basicprogram;
//calculation of strong number

import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		int num,i,fact,lastdigit;    //declaring variable
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number: ");
		num=sc.nextInt();    //taking value from user
		int sum=0,temp=num;  //store num in temp for future use
		
		// while loop for generate strong number
		while (num!=0) 
		{
			i=1;
			fact=1;
			lastdigit= num%10; 
			
		// while loop for calculate factorial
		while (i<= lastdigit)
		{
			fact=fact*i;    //factorial logic
			i++;
		}
		sum=sum+fact;    // sum the factorial numbers
		num=num/10;
		}
		
		// checking for strong number
		if(sum==temp)
			System.out.println(temp+" is a strong number.");
		else
			System.out.println(temp+" is not a strong number.");
			
	}

}
