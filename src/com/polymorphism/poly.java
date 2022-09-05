package com.polymorphism;

public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p; //defination
		
		//create with parent class
		
		p = new ParentClass();
		p.printStmt();
		p = new ChildClass();
		p.printStmt();
		    
		
		
		
	}

}
