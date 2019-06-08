package com.abstract1.example;

public class TestClass {
	public static void main(String[]args) {
		System.out.println("############SbiBank s=new SbiBank();###########");
		SbiBank s=new SbiBank();
		s.getMessage();
		s.interest();
		System.out.println("Bank s1=new SbiBank");
		Bank s1=new SbiBank();
		s.getMessage();
		s.interest();
		System.out.println("######UcoBank u=new UcoBank();#########");
		UcoBank u=new UcoBank();
		u.getMessage();
		u.interest();
	}

}
