/**
Stacks

LIFO (Last In First Out)
{
	Push, Pop, Peak
	Check to see if its empty 
}
*/

public interface Stack<E>
{
	void push(E item); // adds item to top
	E pop(); // removes item from top
	E peek(); //tells what is on top
	boolean isEmpty(); // returns boolean if it is emptys
	
}

//Stack<Character> calculator = new Linkedlist<Character>(); should be able to compile 