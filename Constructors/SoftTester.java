package com.xworkz.Soft;

public class SoftTester {

	public static void main(String[] args) {
		 Soft s=new Soft("Mazaa",50,"Mango",56);
		 System.out.println(s.brandname + s.price + s.flavour + s.quantity);
		 System.out.println("-----------------------");
		 
		 Soft s1=new Soft("Fruity",60,"Strawberry",51);
		 System.out.println(s1.brandname + s1.price + s1.flavour + s1.quantity);
		 System.out.println("-----------------------");
		 
		 Soft s2=new Soft("Pepsi",70,"Apple",26);
		 System.out.println(s2.brandname + s2.price + s2.flavour + s2.quantity);
		 System.out.println("-----------------------");
		 
		 Soft s3=new Soft("cococola",23,"Pineapple",36);
		 System.out.println(s3.brandname + s3.price + s3.flavour + s3.quantity);
		 System.out.println("-----------------------");
		 
		 Soft s4=new Soft("Mirinda",50,"Blackberry",66);
		 System.out.println(s4.brandname + s4.price + s4.flavour + s4.quantity);
		 System.out.println("-----------------------");
		  
	}
}
