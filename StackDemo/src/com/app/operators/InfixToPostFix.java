package com.app.operators;

import java.util.Scanner;

import com.app.test.Stack;

public class InfixToPostFix {
	public static int findPrecedance(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();

			Stack s1 = new Stack(s.length());
			char ch;
			char[] arr = s.toCharArray();
			char[] postfix = new char[100];
			int i = 0, j = 0;
			for (char c : arr) {
				if (c == '(') {
					s1.push(c);
				} else if (c >= 'a' && c <= 'z') {
					postfix[j++] = c;
				} else if (c == '+' || c == '-' || c == '*' || c == '/') {
					while (s1.peep() == '+' || s1.peep() == '-' || s1.peep() == '*' || s1.peep() == '/') {
						if (findPrecedance((char) s1.peep()) >= findPrecedance(c)) {
							postfix[j++] = (char) s1.pop();
						} else
							break;
					}
					s1.push(c);

				} else if (c == ')') {
					while((ch=(char)s1.pop())!='(') {
						postfix[j++]=ch;
					}
				}

			}
			System.out.println("Postfix from of given prefix : " + String.valueOf(postfix));
		}
	}
}
