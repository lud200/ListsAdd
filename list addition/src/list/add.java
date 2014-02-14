package list;
import java.io.*;
import java.util.*;

public class add {
	public static void main(String[] args){
		LinkedList l=new LinkedList();
		l.addLists();
	}
}

class LinkedList{
	int data;
	LinkedList next;
	LinkedList(){
		int data = 0;
		LinkedList next = null;
		this.data=data;
		this.next=next;
	}
	LinkedList head;
	Scanner sc=new Scanner(System.in);
	public LinkedList addFirst(){
		LinkedList node=new LinkedList();
		if(head==null){
			head=node;
			System.out.println("Enter the value");
			head.data=sc.nextInt();
			head.next=null;
			return head;
		}
		else{
			System.out.println("Enter a value");
			node.data=sc.nextInt();
			node.next=head;
			head=node;
			return head;
		}
	}
	
	public void addLists(){
		LinkedList l1=new LinkedList();
		l1.addFirst();
		LinkedList l2=new LinkedList();
		l2.addFirst();
		int carry=0, value=0;
		LinkedList sum=new LinkedList();
		
		if(l1==null || l2==null){
			System.out.println("Both the lists are null");
		}
		/*if(l1==null){
			System.out.println(l2);
		}
		if(l2==null){
			System.out.println(l1);
		}*/
		else{
				value=value+l1.data+l2.data+carry;
				sum.data=value%10;
				if(value>10){
					carry=1;
				}
				l1=l1.next;
				l2=l2.next;
				System.out.println("Value="+value);
				System.out.println(sum.data);
		}
	}
	public void print(){
		LinkedList n=new LinkedList();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
}