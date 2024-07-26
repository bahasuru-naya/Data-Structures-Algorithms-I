/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author LENOVO
 */
public class Node {
    public int data;
    public Node next;
	
	public Node(int item) {
		this.data = item;
		next =null;
	}
	public void diaplayNode()
	{
		System.out.print(data + " ");
	}
}
