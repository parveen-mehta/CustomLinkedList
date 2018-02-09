package com.sample;

public class CustomLinkedList {

	private Node first; // ref to first link on list
	 
    /**
     * CustomLinkedList constructor
     */
    public CustomLinkedList(){
           first = null;
    }
    
    /**
     * Inserts new Node at last of Singly LinkedList.
     */
    public void insertLast(int data){
           Node newNode = new Node(data); //Creation of New Node.
           
           if(first==null){  //means LinkedList is empty, make first point to new Node.
                  first=newNode;    //first ---> newNode
                  return;
           }
           
           Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
           while(tempNode.next!=null){ //Executes until we don't find last Node of LinkedList.
                                                           //If next of some Node is pointing to null, that means it's a last Node.
                  tempNode=tempNode.next; //move to next Node.
           }
           tempNode.next=newNode;  //make last's Node next point to new Node
    }
 
    /**
     * Deletes last Node from Singly LinkedList
     */
    public Node deleteLast(){
           
           //Case1: when there is no element in LinkedList
           if(first==null){  //means LinkedList in empty, throw exception.              
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }
           
           //Case2: when there is only one element in LinkedList
           if(first.next==null){   //means LinkedList consists of only one element, delete that.
                  Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
                  first=first.next; // delete firstNode (make first point to secondNode)
                  return tempNode;  //return deleted Node.
           }
           
           //Case3: when there are atLeast two elements in LinkedList
           Node previous=null; 
           Node current=first;
           
           while(current.next!=null){//Executes until we don't find last Node of LinkedList.
                                             //If next of some Node is pointing to null, that means it's a last Node.
                  previous=current;
                  current=current.next;   //move to next node.
           }
           
           previous.next=null;     //Now, previous is pointing to second last Node of LinkiedList,
                                                    //make it point to null [it byPasses current Node(last Node of LinkedList) which was in between]
           return current;
    }
    
    /**
     * Removes all Elements Greater than target value
     */
    public void removeAllGreaterThanTargetValue(int targetValue){
    	
    	//Case1: when there is no element in LinkedList
        if(first==null){  //means LinkedList in empty, throw exception.              
               throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
        }
        
        //Case2: when there is only one element in LinkedList
        if(first.next==null){   //means LinkedList consists of only one element, delete that.
               first=first.next; // delete firstNode (make first point to secondNode)
               return;  
        }
        
        Node previous=null; 
        Node current=first;
        
        //Case3: when there are more elements remove greater than target value
        while(current != null) {
        	Node next = current.next;
        	if(current.data > targetValue) {
        		if(previous == null) {
        			current=next;
        		} else {
        			previous.next = next; 
        		}
        	} else {
       		    previous=current;
        	}
        	current = current.next;
        }
    }
    
    /**
     * Display LinkedList
     */
    public void displayLinkedList() {
           //System.out.print("Displaying LinkedList [first--->last]: ");
           Node tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
}
