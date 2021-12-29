package examples;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {
	public static void main(String[] args) {
		// Queues follow the FIFO rule *First In, First Out*
		// It's not possible to change the ordenation of the items in the list
		
		Queue<String> bankQueue = new LinkedList<>();
		
		bankQueue.add("Fábio");
		bankQueue.add("Roberto");
		bankQueue.add("Mário");
		bankQueue.add("José");
		bankQueue.add("João");
		bankQueue.add("Enzo");
		bankQueue.add("Lorenzo");
		bankQueue.add("Vincenzo");
		bankQueue.add("Renzo");
		
		System.out.println("Bank Queue: " + bankQueue);
		
		// main methods of Queue
		// queueName.poll() --> Returns list head and removes it, returns null if empty
		// queueName.peek() --> Returns list head but don't remove it, returns null if empty
		// queueName.element() --> Returns list head but don't remove it, throws exception if empty
		
		String customerTurn;
		
		customerTurn = bankQueue.poll();
		System.out.println("\n [poll] Customer: " + customerTurn);
		System.out.println("Bank Queue: " + bankQueue);

		customerTurn = bankQueue.peek();
		System.out.println("\n [peek] Customer: " + customerTurn);
		System.out.println("Bank Queue: " + bankQueue);
		
		customerTurn = bankQueue.element();
		System.out.println("\n [element] Customer: " + customerTurn);
		System.out.println("Bank Queue: " + bankQueue);
		
		

	}
}
