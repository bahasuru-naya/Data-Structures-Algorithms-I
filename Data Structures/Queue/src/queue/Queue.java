/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author LENOVO
 */
public class Queue {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {//add items to rear
       
        queueArray[++rear] = value; // Increment rear and insert
        nItems++; // One more item
    }

    public int dequeue() {//delete  ang get item form  fornt
        int temp = queueArray[front++]; // Get value and increment front      
        nItems--; // One less item
        return temp;
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
        for(int i= front; i<=rear;i++)
        {
            System.out.print(queueArray[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
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
        //q.enqueue(3);//can't add new item because rear reach to end of arrray
        
    }
    
}
