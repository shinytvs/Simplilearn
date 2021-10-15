package Basic;

import java.util.Scanner;

public class Calculator {
    int ans=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n1,n2,n3,a,b,d;
		float f;
		
		// TODO Auto-generated method stub
	
		System.out.println("==============================================");
		System.out.println("1. + for ADDITION");
		System.out.println("2. - for SUBTRACTION");
		System.out.println("3. * for MULTIPLICATION");
		System.out.println("4. / for DIVISION");
		
		System.out.println("0. for QUIT");
		System.out.println("==============================================");
		System.out.println("please enter your choice");
		Scanner s=new Scanner(System.in);
		n3=s.nextInt();
		if(n3!=1 || n3!=2||n3!=4)
		{System.out.println("Wrong option try again");
		System.exit(0);
		}
		System.out.println("enter first number");
		
		n1=s.nextInt();
		System.out.println("enter second number");
		n2=s.nextInt();
		Calculator c=new Calculator();
		if(n3==1)
		{
		a=c.Addition(n1,n2);
		System.out.println("the sum is"+" "+a);
		}
		else if(n3==2){		
		b=c.Substraction(n1,n2);
		System.out.println("the differe is"+" "+b);
		}
		else if(n3==3){
		d=c.Multiplication(n1,n2);
		System.out.println("the product is"+" "+d);
		}
		else if(n3==4){
		 f = c.Division(n1,n2);
		System.out.println("the quotient is"+" "+f);
		}
		else
			System.out.println("Wrong Option");
			System.exit(0);
			s.close();	
	}
	
	private int  Addition(int x,int y)
	{
   ans=x+y;
   return ans;
}
	private int Substraction(int x,int y)
	{ans=x-y;
	return ans;}
	
	private int Multiplication(int x,int y)
	{ans=x*y;
	return ans;}
	
	private float Division(int x,int y)
	{ans=x/y;
	return ans;}
	
}
