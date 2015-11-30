/**
This is a my LinkedList Runner.

@author Kevin Chow
@version 11.29.15
*/
public class RunnerLinkedList
{
	public static void main(String[] args)
	{
		ListNode<String> node = new ListNode<String>("0");	
		LinkedList<String> list = new LinkedList<String>(node);
		
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.remove("0"));
	
		System.out.println(list);
		System.out.println(list.size());
	

		
				
		
	
	}
	
}

/**



Stack<String> stack = new LinkedList<String>();
		
		stack.push("0.3");
		stack.push("0.2");
		stack.push("0.1");
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack);

		Stack<Character> calculator = new LinkedList<Character>(); 

		void push(E item); // adds item to top
		E pop(); // removes item from top
		E peek(); //tells what is on top
		boolean isEmpty(); // returns boolean if it is empty
	
	
	
queue.offer("5");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.isEmpty());



		System.out.println(queue.poll());
		
		System.out.println(queue);

		System.out.println(queue.offer("0"));
		
		System.out.println(queue);

	
	
	
	for(String each:list)
			System.out.print(each);		
	

		list.set(3,"3.3");

	System.out.println(list2);
		System.out.println(list2.size());
		System.out.println(list2.head);
		System.out.println(list2.tail);

	LinkedList<String> list2 = new LinkedList<String>(list);

	

	System.out.println(list.getHead());
		System.out.println(list.getTail());



//list.add(2, 25);
//list.add(0, 1000);
System.out.println(list.head);
System.out.println(list.tail);
System.out.println(list);
System.out.println(list.size());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
list.remove("1");
list.add (1,"1");
		System.out.println(list.remove(2));
list.addFirst("-1");
		list.addLast("5");
			System.out.println(list.contains("2"));

list.remove(2);
		//list.remove(4);
		System.out.println(list.indexOf("3"));


	LinkedList<String> list = new LinkedList<String>();
		list.add(0,"0");		
		list.add(1,"1");
		list.add("2");
		list.add(3,"3");
		list.add("4");
		System.out.println(list);
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.set(4,"4/3"));
	
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		list.removeFirst();
	String item = list.get(0);
		if(list.removeFirst() == item)
		{
			System.out.println(list.head);
			System.out.println(list.tail);
		}
*/