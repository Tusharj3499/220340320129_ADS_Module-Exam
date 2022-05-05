import java.util.Scanner;
class Sorting_Q1
{
	
		Void insertion_sort(int arr[])
		{
		int n=arr.length;
		for(int i=n-1;1>0;i--)
		{
			int k=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>k){
				arr[j+1]=arr[j];
				j=j-1;
				display(arr);
		}
		arr[j+1]=k;
		}
	}
	
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		
		
	public static void main(String[] args)
	{
		Sorting_Q1 q1= new Sorting_Q1();
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
				arr[i]=sc.nextInt();
			
		}
		q1.insertion_sort(arr);
		q1.display(arr);
		
	}
}