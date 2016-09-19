public class Node {
	private int data ; //data field
	private Node next ; //reference variable to point to the next node in the linked list
	
  //parametrized constructor for a new node. 
  //Since, we're adding nodes at the end, this new node will link to null, representing it as the last element in the list
	Node(int data) {  
		this.data = data ;
		this.next = null ;
	}

	public Node getNextNode() {
		return next ;
	}
	
	public int getData() {
		return data ;
	}
	
 //to link this node to the next node in the linked list 
	public void setNextNode(Node nextNode) {
		next = nextNode ;
	}
}



public class LinkedList {
	
	private static Node head ; 
	private static Node newNode ; 
	
	public static void printData(Node head) {
                Node temp = head ; //start from the head node 
                
   //keep reading data from the nodes till the last node is reached
		while(temp != null) {
                        System.out.println(temp.getData()) ;
			temp = temp.getNextNode() ;
	        }    
        }
	
  //method to insert a new node at the end of the linked list
	public static void insert(int data) {
		newNode = new Node(data) ; //reference variable to point to the new node 
                
    //if the linked list is empty, point to the first node
		if(head == null) {  
			head = newNode ;
		}
                
    //if the linked list is not empty, make the new node pointed by the last node available in the linked list.
		else { 
		Node tempVar = head ;
		while(tempVar.getNextNode() != null) {
			tempVar = tempVar.getNextNode() ;
		}
		tempVar.setNextNode(newNode);
		}
	}
	
	public static void main(String[] args) {
		printData(head) ; //this should not print anything as the list is empty right now
		insert(100) ; //insert 100
		printData(head) ; //should print 100
                System.out.println() ;
                insert(200) ; //insert 200 
		printData(head) ; //should print 100 and 200
                System.out.println() ;
                insert(300) ; //insert 300
		printData(head) ; //should print 100, 200 and 300
	}
	
}
