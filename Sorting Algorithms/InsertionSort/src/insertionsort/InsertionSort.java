/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

/**
 *
 * @author LENOVO
 */
public class InsertionSort {

    public void insetion(int a[])
    {
        for(int i=1;i< a.length; i++)
        {
           int temp =a[i];
           int j=i-1;
           while(j>=0 && a[j]>temp )
           {
               a[j+1]=a[j];
               j--;
               
           }
           a[j+1]=temp;
        }
    }
    public void display(int a[]) {
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a []= {2,4,3,1,55,3,6,7,4,10};
        InsertionSort i = new InsertionSort();
        i.display(a);
        i.insetion(a);
        System.out.println("After insertion sort");
        i.display(a);
    }
    
}
