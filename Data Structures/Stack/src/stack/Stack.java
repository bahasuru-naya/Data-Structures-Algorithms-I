/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author LENOVO
 */
public class Stack {

    public int maxSize;
	public int [] stackData;
	public int top;
	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stackData = new int[this.maxSize];
		this.top = -1;
	}
	public void push(int j)
	{
		if(this.isFull()==true)
		{
			System.out.println("Can't insert Stack is full");
		}
		else
		{
			top=top+1;
			stackData[top]=j;
		}
		
	}
	public int pop()
	{
		if(this.isEmpty()==true)
		{
			System.out.println("Can't pop Stack is Empty");
			return 0;
		}
		else
		{
			
			top=top-1;
			return stackData[top+1];
			
		}
		
		
		
	}
	public int peek()
	{
		return stackData[top];
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
        public void dispalay()
        {
            if(this.isEmpty()==true)
		{
			System.out.println("Can't display Stack is Empty");
			
		}
            else
            {
                for(int i=top;i>=0;i--)
                {
                    System.out.println(stackData[i]);
                }
            }
        }
	public boolean isFull()
	{
		if(top==maxSize-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println("delete item :"+st.pop());
	st.push(2);
	System.out.println("top item :"+st.peek());
	st.push(5);
	System.out.println("delete item :"+st.pop());
	System.out.println("top item :"+st.peek());		
	st.push(9);
	st.push(7);
        st.dispalay();
	System.out.println("top item :"+st.peek());
	st.push(67);
	st.push(45);
	System.out.println("delete item :"+st.pop());
	System.out.println("top item :"+st.peek());
	st.push(9);
	st.push(9);
    }
    
}
