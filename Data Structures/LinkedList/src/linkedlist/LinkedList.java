/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author LENOVO
 */
public class LinkedList {

    private Node head;	   

	    public void add(int data) { // add new node to last node
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }
             public void addAfter(int key,int data) { // add new node to last node
	        Node newNode = new Node(data);
	       
	            Node current = head;
	            while (current.next != null) {
                        if(current.data==key)
	        	{
	        		break;
	        	}else {
	                current = current.next;
                        }
	            }
                    newNode.next=current.next;
	            current.next = newNode;
	        
	    }
            public void delete() { // delete last node
	        
	            Node current = head;
                    Node previous = null;
	            while (current.next != null) {
                        previous=current;
	                current = current.next;
	            }
	            previous.next = null;
	        
	    }

	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
             public int count() {
	        Node current = head;
	        int c=0;
	        while (current != null) {
	            c++;
	            current = current.next;
	        }
	        return c;
	    }
	    
	    public int search(int key) {
	        Node current = head;
	        int c=0;
	        while (current != null) {
	        	if(current.data==key)
	        	{
	        		break;
	        	}else {
	            c++;
	            current = current.next;
	        	}
	        }
	        return c;
	    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(34);
        l.add(26);
        l.display();
        l.delete();
        l.display();
        System.out.println("number of nodes "+ l.count());
        l.add(67);
        l.display();
        l.delete();
        l.display();
        l.addAfter(34,10);
        l.display();
        
    }
    
}
