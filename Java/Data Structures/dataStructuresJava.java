import java.util.*;

public class dataStructuresJava{

public static void main(String[] args){

	//Implementing Linked List in Java
	List<String> linkedList = new ArrayList<String>();

	linkedList.add("my name jeff");
	linkedList.add("my name bob");

	System.out.println(linkedList.get(0));

	displayValue("End of Linked List");
	//Implementing Stack in Java
	Deque<Integer> stack = new ArrayDeque<Integer>();

	stack.push(1);
	stack.push(2);
	stack.push(3);
	for(int i = 0; i < 3; i++){
		System.out.println(stack.pop());
	}
	displayValue("End of Stack");
	//Implementing Queue in Java
	Deque<Double> myQueue = new LinkedList<Double>();

	myQueue.add(2.0);
	myQueue.add(1.9);
	myQueue.add(1.8);

	//Using an interator
	Iterator<Double> queueIterator = myQueue.iterator();
	while(queueIterator.hasNext()){
		System.out.println(queueIterator.next());
	}
	displayValue("End of Queue");

	//Implementing Dictionaries/Hashmap in Java --> Note: Hashmaps can use any data structure for implementation
	Dictionary<Integer, List<String> > myHashmap = new Hashtable<Integer, List<String> >();

		//Insertion
		List<String> myLinkedList = new ArrayList<String>();
		myLinkedList.add("First Item");
		myLinkedList.add("Second Item");
		myHashmap.put(1, myLinkedList);

		//Retrieval
		List<String> retrievedLinkedList = myHashmap.get(1);
		System.out.println(retrievedLinkedList.get(0));
		System.out.println(retrievedLinkedList.get(1));

		displayValue("End of Hashmap");
}

public static void displayValue(String arg){
	System.out.println("---------- " + arg + " ----------");
}


}