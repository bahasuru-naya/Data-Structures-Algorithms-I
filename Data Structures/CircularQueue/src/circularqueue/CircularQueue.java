/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circularqueue;

/**
 *
 * @author LENOVO
 */
public class CircularQueue {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {//add items to rear
        if(this.isFull())
        {
            System.out.println("queue is full"); 
        }
        else{
        rear =(rear+1)% maxSize;  //wrap around
        queueArray[rear] = value; // Increment rear and insert
        nItems++; // One more item
        }
    }

    public int dequeue() {//delete  ang get item form  fornt
        if(this.isEmpty())
        {
            System.out.println("array is empty");
            return 0;
        }
        else{
        int temp = queueArray[front]; // Get value and increment front  
        front =(front+1)% maxSize;  //wrap around
        nItems--; // One less item
        return temp;
        }
    }

    public int peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
    public void display(){
        if(front<=rear){
        for(int i= front; i<=rear;i++)
        {
            System.out.print(queueArray[i]+" ");
        }
        }
        else{       
        for(int i= front; i<maxSize;i++)
        {
            System.out.print(queueArray[i]+" ");
        }
         for(int i= 0; i<=rear;i++)
        {
            System.out.print(queueArray[i]+" ");
        }    
        }
        System.out.println("");
    }
    public static void main(String[] args) {
       CircularQueue q = new CircularQueue(5);
        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(8);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(9);
        q.display();
        q.enqueue(33);
        q.display();
        q.enqueue(3);//can add new item when rear reach to end of array because array is wrap around
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(45);
        q.display();
        q.enqueue(1);
        
    }
    
}
