package com.app.classes;

public class CTester {

	public static void main(String[] args) throws Exception{
		CQueue cq= new CQueue();
		cq.addElement(10);
		cq.addElement(20);
		cq.addElement(30);
		cq.addElement(40);
		cq.addElement(50);
		System.out.println(cq.removeElement());
		System.out.println(cq.removeElement());
		System.out.println(cq.removeElement());
		System.out.println(cq.removeElement());
		cq.addElement(50);
		System.out.println(cq.removeElement());

	}

}
