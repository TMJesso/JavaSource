package stacks;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	/** construct a stack with the default capacity 16 */
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}
	
	/** construct a stack with the specified maximum capacity */
	public StackOfIntegers(int capacity) {
		this.elements = new int[capacity];
	}
	
	/** push a new integer to the top of the stack */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	
	/** return and remove the top element from the stack */
	public int pop() {
		return elements[--size];
	}
	
	/** return the top element from the stack */
	public int peek() {
		return elements[size -1];
	}
	
	/** test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}
	
	/** return the number of elements in the stack */
	public int getsize() {
		return size;
	}
}
