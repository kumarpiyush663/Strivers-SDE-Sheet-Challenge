import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.
	class LinkedListNode<T>
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data)
        {
        	this.data = data;
    	}
	}

*/
public class Solution
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> temp = head;
        while(head!=null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
            if(head!=null && head.data == -1) break;
        }
        return prev;
    }
}