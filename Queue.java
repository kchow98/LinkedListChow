//First in First out, FIFO
public interface Queue<E>
{
	void offer(E Item);//like push
	E poll();// like pop
	E peek();// like peek
	boolean isEmpty(); // like isEmpty
}