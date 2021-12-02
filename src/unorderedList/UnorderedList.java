package unorderedList;

public class UnorderedList {
	
	Node head = null;

	public void insert(String word) {
		Node node = new Node(word);
		if (head == null) {
			head = node;
		}
		else {
			Node iterator = head;
			while(iterator.next != null) {
				iterator = iterator.next;
			}
			iterator.next = node;
		}
	}
	
	public void search(String word) {
		Node iterator = head;
		while(iterator != null) {
			if(word.equals(iterator.word)) {
				System.out.println(" found the word");
				return;
			}
			iterator = iterator.next;
		}
	}
	
	public void display() {
		Node iterator = head;
		System.out.println();
		while(iterator != null) {
			System.out.print(" " + iterator.word);
			iterator = iterator.next;
		}
	}
}
