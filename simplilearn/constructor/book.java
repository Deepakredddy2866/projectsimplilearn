package com.simplilearn.constructor;

//Q5
public class book {
	String Title;
	int pageno;
	String Author;
	double Price;
	
	book()
	{
		
	}
	
	book(String T, int p,String A,double pr){
		this.Title=T;
		this.pageno=p;
		this.Author=A;
		this.Price=pr;
	}
	
	public void display() {
		System.out.println("Title:" +Title);
		System.out.println("pageno:"+pageno);
		System.out.println("Author:"+Author);
		System.out.println("price:"+Price);
	}
	
	public static void main(String[] args) {
		book b=new book();
		book b1=new book("Drama",300,"nolan",200.50);
		
		b.display();
		b1.display();

		

		
	}
}
