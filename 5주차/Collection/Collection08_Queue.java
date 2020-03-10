package java10_Collection;

import java.io.*;
import java.util.*;

public class Collection08_Queue {
	public static void main(String[] args) {
		
		//Queue
		Queue queue = new LinkedList();
		
		queue.offer("Alice");
		queue.offer("Bob");
		queue.offer("Clare");
		queue.offer("Daram!");
		
		System.out.println(queue);
		System.out.println("크기 : " + queue.size());
		
		System.out.println("===============");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("===============");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("크기 : " + queue.size());
		
	}
}
