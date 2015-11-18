/**
This is a my LinkedList class. 

@author Kevin Chow
@version 11.15.15
*/
public class LinkedList<E>
{
	//First item in the LinkedList
	private ListNode<E> head;
	
	//points to last node in list
	private ListNode<E> tail;
	
	//number of nodes in list
	private int size;
	
	/**
	Default constructor. Sets head and tail to null just for good coding practice. Size
	is set to 0.
	*/
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	Return the number of nodes in the LinkedList
	@return int number of nodes in the LinkedList
	*/
	public int size()
	{
		return size;
	}
	
	/**
	Adds node to end of the LinkedList.
	@param E toAdd node to add
	@return boolean whether the ListNode was added.
	*/
	public boolean add(E toAdd)
	/**
	I wrote this add method before the other one. As a result, there is probably some code
	repeated between the two. Should I change this method to call the other add method?
	*/
	{
		ListNode<E> newNode = new ListNode<E>(toAdd);
		if(size==0)
		{
			head = new ListNode<E>(null, newNode);
			tail = new ListNode<E>(null, newNode);
			size++;
		}
		else
		{	
			tail.getNext().setNext(newNode);
			tail.setNext(newNode);
			size++;
		}
		return true;

	}
	
	/**
	Add item to the specified spot and shift the other items down
	@param int index what spot to add item at
	@param E toAdd item to add 
	@return boolean whether the ListNode was added.
	*/
	public boolean add(int index, E toAdd)
	{
		if (index<0 || index>size)
			throw new IndexOutOfBoundsException();
			
		int counter = 0;
		ListNode<E> newNode = new ListNode<E>(toAdd);
		
		if (index == 0)
		{
			if (size == 0)
			{
				add(toAdd);
			}
				
			else
			{
				newNode.setNext(head.getNext());
				head.setNext(newNode);
				size++;
				return true;	
			}
			
		}
		
		if (index == size)
		{
			add(toAdd);
			size++;
			return true;
		}

		for(ListNode<E> curr = head.getNext(); curr != null; curr = curr.getNext())
		{
			if(counter == index-1)
			{
				newNode.setNext(curr.getNext());
				curr.setNext(newNode);
				size++;
				
				return true;
			}
			counter++;
		}
		return false;
	}
	
	/**
	How the LinkedList will be displayed once printed
	@return String string visual of LinkedList
	*/
	public String toString()
	{
		String toPrint = "{";
		for(ListNode<E> curr = head.getNext(); curr != null; curr = curr.getNext())
		{
			toPrint += curr.toString();
			toPrint +=", ";
		}
		toPrint = toPrint.substring(0,toPrint.length()-2);
		toPrint +="}";
		return toPrint;
	}
	
}























/**
public int size()
	{
		//easy way is returning size()
		//lets do the fun hard way
		if (head == null)// in case linkedlist has nothing in it, would crash that for loop
			return 0; 
			
		int count = 1;// if it got to this point, at least 1 thing would get there.
		
		//how to loop through a LinkedList
		for(ListNode<E> curr = head; curr.getNext != null; curr = curr.getNext())
		{
			count++;
		}
		return count;
	}

public int size()
	{
		return size(head)
	}
	private int size(ListNode<E> node)
	{
		if(node == null)
			return 0;
		else
			return 1 + size(nodegetNext());
	}
*/