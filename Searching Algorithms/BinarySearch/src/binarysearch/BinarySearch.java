/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BinarySearch {

    public int bsearch(int key, int a[])
    {
        int left=0;
        int right =a.length -1;
        int mid=0;
        while(left<=right)
        {
            mid =left+(right-left)/2;
            if(a[mid]==key)
                return mid;
            else if(key<a[mid])
                right=mid;
            else
                left=mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={22, 33, 40, 50, 55, 65, 70, 88, 99};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter serch key :");
        int key = sc.nextInt();
        BinarySearch b =new BinarySearch();  
        System.out.println("index of serched item: "+ b.bsearch(key, a));
        
        
                        
                
                
                

    }
    
}
