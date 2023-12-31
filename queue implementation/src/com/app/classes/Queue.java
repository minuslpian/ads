package com.app.classes;

public class Queue {
	private int size;
	private int []arr;
	private int rear,front;
	public Queue() {
		size=5;
		arr=new int[size];
		rear = front=-1;
		
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean isEmpty() {
		return rear==front;
	}
	
	public Queue(int s) {
		size=s;
		arr=new int[size];
		rear = front=-1;
	}
	public void addElement(int val) throws Exception {
		if(!isFull()) {
			arr[++rear]=val;
		}else
			throw new Exception("Overflow!!");
		
	}
	public int removeElement() throws Exception {
		if(!isFull()) {
			return arr[++front];
		}else
			throw new Exception("underflow!!");
		
		
	}
}
