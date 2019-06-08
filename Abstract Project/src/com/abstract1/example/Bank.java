package com.abstract1.example;


public abstract class Bank {
public abstract void interest();
public Bank() {
	System.out.println("i am bank defult constructor");
	
}
public void getMessage() {
	System.out.println("i am normal getMessage method");
	
}
static {
	System.out.println("i am static block");
}
{
	System.out.println("i am instance block");
}
}
