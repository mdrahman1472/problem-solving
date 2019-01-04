class LinkedList{
	Node head; 
	
	static class Node {
		int data;
		Node next;
		Node (int d)
		{
			data = d;
			next = null;
		}
	}	
	//------------------------------- solution ------------------
		void printNthLast(int n){
			Node temp = head;
			int len = 0;
			// calculate length of likedList
			while (temp != null){
				len++;
				temp = temp.next;
			}
			// if len less than n
			if (len < n)
				System.out.println(-1);
			
			else{
			int NthIndex = len - n;
			for (int i = 1; i < NthIndex+1; i++)
				head = head.next;
			
			System.out.println(head.data);
			}
		}
	//--------------------------------------------------------------
		
		// insert new Node at front of the list
		public void push (int data){
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
			
		
		public static void main (String[] args){
			// list contained elements of 1 2 3 4 5 6 7 8 9
			LinkedList list1 = new LinkedList();
			
			for (int i = 9; i > 0; i--){ // populating linked list
				list1.push(i);
			}
			
			
			// list contained elements of 10 5 100 5 1
			LinkedList list2 = new LinkedList();
			list2.push(1);
			list2.push(5);
			list2.push(100);
			list2.push(5);
			list2.push(10);
			
			list1.printNthLast(2);
			list2.printNthLast(5);
		}
}