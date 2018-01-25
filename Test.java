package com.lexmark.iss.inspire.sessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface A {
	void m();

	default void m2() {
		System.out.println("A");
	}
}

interface B {
	void m();

	default void m2() {
		System.out.println("B");
	}
}

public class Test implements A, B {

	@Override
	public void m() {

	}

	@Override
	public void m2() {
		B.super.m2();
	}

	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		
		list.stream().forEach(a->System.out.println(a));
		
		list.forEach(a->System.out.println(a));
		
		for(String s : list) { // for in
		}
		
		for(int i=0; 1<list.size(); i++) {
		}
		
		
		
		
		
		
	}

}
