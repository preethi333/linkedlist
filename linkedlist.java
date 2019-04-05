/** program to find middle element in the linked list
*/



import java.util.*;
import java.lang.*;
import java.io.*;


class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void printList(){ 
        Node node = head; 
        while (node != null){ 
            System.out.print(node.data+" "); 
            node = node.next; 
        } 
        System.out.println(); 
    } 
    public void push(int data){ 
        Node newnode = new Node(data); 
        newnode.next = head; 
        head = newnode; 
    } 
    void printMiddle(){ 
        Node slowptr = head; 
        Node fastptr = head; 
        if (head != null){ 
            while (fastptr != null && fastptr.next != null){ 
                fastptr = fastptr.next.next; 
                slowptr = slowptr.next; 
            } 
            System.out.println("The middle element is [" + 
                                slowptr.data + "] \n"); 
        } 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
	     LinkedList list=new LinkedList();
	     for (int i=6; i>0; --i){ 
            list.push(i); 
        }
            list.printList(); 
            list.printMiddle(); 
        
	     
	}
}