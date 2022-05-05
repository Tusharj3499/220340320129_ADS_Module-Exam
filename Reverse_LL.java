import java.util.Scanner;
class Reverse_LL
{
	Scanner sc = new Scanner (System.in);
	static class Node
	{
		int data;
		Node  next;
		
		Node(int data)
		{
			this.data=data;
			this.next= null;
		}		
	}
	Node head = null;
	public void insertAtfirst()
	{
	System.out.println("Enter Element for insertion At First");
	int data = sc.nextInt();
	Node new_node = new Node(data);
		if(head==null)
		{
			head = new_node;
		}
		else
		{
			new_node.next=head;
			head=new_node;	
		}
	}
		public void insertlast()
		{
		System.out.println("Enter Element for insertion At last");
		int data = sc.nextInt();
		Node new_node = new Node (data);
		if(head==null)
		{
			head=new_node;
		}
		else
		{
				Node temp=head;
				while(temp.next!=null)
				{
					temp = temp.next;
				}
			temp.next = new_node;
			
		}	
			
		}	
		
		public void reverse(Node temp)
		{
		if(temp==null)
		{
			return;
			
		}
		else
		{
			reverse(temp.next);
			System.out.println(temp.data+" ");
			
		}	
		}
		
		public  void reversal()
		{
			System.out.print("Element Reverse--->");
			reverse(head);
			System.out.println();
		}
		public void Display()
		{
			Node temp=head;
			if(head==null)
			{
				System.out.println("Linked list is Empty");
			}
			else
			{
				while(temp!=null)
				{
					System.out.println(temp.data+"-->");
					temp=temp.next;
					
				}	
			}	
		}
		public static void main(String[] args)
		{
		Reverse_LL  r1 = new Reverse_LL();
		 r1.insertAtfirst();
		r1.insertAtfirst();
		r1.insertAtfirst();
		r1.insertAtfirst();
		r1.insertAtfirst();
		r1.Display();
		r1.insertlast();
		r1.insertlast();
		r1.insertlast();
		r1.insertlast();
		r1.Display(); 
		r1.reversal();
		r1.Display();  
		
		
		
		}
}