import java.util.Scanner;
class Solution_Q3
{
	
	Scanner sc = new Scanner(System.in);
	
	int arr[]= new int[10];
	int n=arr.length;
	int top=-1;
	int bottom=n;
	
	
	public void push1()
	{
		if(top==(n-1))
		{
			System.out.println("stack overflow");
			return;
			
		}
		
		System.out.println("enter data");
		int data=sc.nextInt();
		top=top+1;
		arr[top]=data;
		
			
		}
		
	public void pop1()
	{
		if(top==-1)
		{
			System.out.println("underflow ");
			return;
			
		}
		
		System.out.println("popped data");
		
		top=top-1;
	}
	
	public void push2()
	{
		if(bottom==0)
		{
			System.out.println("stack overflow");
			return;
			
		}
		
		System.out.println("enter data");
		int data=sc.nextInt();
		bottom=bottom-1;
		arr[bottom]=data;
		
			
		}		
public void pop2()
	{
		if(bottom==n)
		{
			System.out.println("underflow ");
			return;
			
		}
		
		System.out.println("popped data");
		
		bottom=bottom+1;
	}
	
	


	public static void main(String[] args)
	{
		Solution_Q3  s1 = new Solution_Q3();
		s1.push1();
		s1.push2();
		s1.push2();
		s1.push1();
			s1.push2();
				s1.push2();
				s1.pop1();
				s1.pop2();
		
		
	}
}
	