package com.example;

import com.example2.Example2;

public class MainMethod extends Example2 {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.hi();
		ex.print();
		ex.welcome();

		MainMethod m = new MainMethod();
		m.hi1();
		m.welcome1();
	}
}
