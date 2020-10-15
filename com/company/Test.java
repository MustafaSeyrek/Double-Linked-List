package com.company;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList DLL = new DoubleLinkedList();
		DLL.add(10);
		DLL.add(20);
		DLL.add(30);
		DLL.add(40);
		DLL.add(50);
		DLL.add(60);
		DLL.add(70);
		DLL.add(80);
		DLL.add(90);





		DLL.display1();                          // 20  30  50  60  70  80
		DLL.display2();
		Scanner scn = new Scanner(System.in);
		System.out.print("x= ");
		int x = scn.nextInt();
		while(x<=0){
			System.out.println("Please enter true value");
			System.out.print("x= ");
			x = scn.nextInt();
		}

		DLL.swap(x);
		DLL.display1();


	}

}
