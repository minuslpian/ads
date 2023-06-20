package com.app.operators;

import java.util.Scanner;

import com.app.test.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) throws Exception {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter paranthesis: ");
			String c= sc.next();
			char arr[]= c.toCharArray();
			Stack s1=new Stack(100);
			int i = 0, j = 0;
			for (char ch : arr) {
				if (ch == '(' || ch=='[' || ch=='{') {
					s1.push(ch);
				}
				else if(ch == ')' ) {
					if(s1.peep()=='(') {
						s1.pop();
					}
					else {
						break;
					}}
					else if(ch==']') {
						if(s1.peep()=='[') {
							s1.pop();
						}
						else {
							break;
						}
					}
					else if(ch=='}') {
						if(s1.peep()=='{') {
							s1.pop();
						}
						else {
							break;
						}
					}
						
					
					
				
		}
			if(!s1.isEmpty()) {
				System.out.println("Imbalanced paranthesis");
			}
			else {
				System.out.println("Balanced paranthesis");
			}

	}

}}
