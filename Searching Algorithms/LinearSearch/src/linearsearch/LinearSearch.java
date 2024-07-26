/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch;

/**
 *
 * @author LENOVO
 */
public class LinearSearch {

    public int search(int key,int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            if(key==a[i])
            {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch l =new LinearSearch();
        int a[]={1,3,4,2,5,7,4};
        System.out.println("key index : "+ l.search(4,a));
    }
    
}
