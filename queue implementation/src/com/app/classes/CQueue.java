package com.app.classes;

public class CQueue {
	private int []arr;
	private int size;
	private int rear,front;
	public CQueue() {
		size=5;
		arr=new int[size];
		rear=front=size-1;
	}
	public CQueue(int s) {
		size=s;
		arr=new int[size];
		rear=front=size-1;
	}
	public void addElement(int val) throws Exception {
		if(!isFull()) {
			rear=(rear+1)%size;
			arr[rear]=val;
		}else {
			throw new Exception("Queue overflow!!!");
		}
		
	}
	public int removeElement() throws Exception{
		if(!isEmpty()) {
			front=(front+1)%size;
			return arr[front];
		}else {
			throw new Exception("Queue underflow!!!");
		}
		
	}
	public boolean isEmpty() {
		return rear==front;
	}
	public boolean isFull() {
		return front==(rear+1)%size;
	}
}
