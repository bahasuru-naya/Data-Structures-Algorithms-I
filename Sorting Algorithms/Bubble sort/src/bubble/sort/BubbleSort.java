/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble.sort;

/**
 *
 * @author LENOVO
 */
public class BubbleSort {

         private int[] a;
	private int nElems;
	public BubbleSort(int max) {
		a = new int[max];
		nElems = 0;
	}
	
	public void insert(int value) {
        if (nElems != a.length) {
            a[nElems] = value;
            nElems++;
           // System.out.println("Inserted value: " + value);
        } else {
            System.out.println("Array has max element");
        }
    }
	
	public void display() {
        System.out.print("Array: ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
	
	public void swap(int one, int two)
	{		
	int temp = a[one];
        a[one] = a[two];
        a[two] = temp;	
		
	}
	
	public void bubbleSort()
	{
		System.out.println("Sorting acending order......");
		 for (int i = 0; i < nElems - 1; i++) {
	            for (int j = 0; j < nElems - 1 - i; j++) {
	                if (a[j] > a[j + 1]) {
	                    swap(j, j + 1);
	                }
	            }
	        }
		
		
	}
    public static void main(String[] args) {
        BubbleSort b = new  BubbleSort(5);
        b.insert(2);
        b.insert(32);
        b.insert(22);
        b.insert(62);
        b.insert(52);
        b.display();
        System.out.println("after bubble sort");
        b.bubbleSort();
        b.display();
    }
    
}
