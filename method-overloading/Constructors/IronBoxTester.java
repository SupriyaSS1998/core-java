package com.xworkz.IronBox;

public class IronBoxTester {
	public static void main(String[] args)
	{
		IronBox i=new IronBox(12,"Orient - Electric",20," White and Black");
		System.out.println(i.id + i.name + i.cost + i.color);
		System.out.println("----------------------------");
		
		IronBox i1=new IronBox(13,"Cropton",56,"Pink");
		System.out.println(i1.id + i1.name + i1.cost + i1.color);
		System.out.println("----------------------------");
		
		IronBox i2=new IronBox(14,"Philips",23,"purpule");
		System.out.println(i2.id +  i2.name + i2.cost + i2.color);
		System.out.println("----------------------------");
		
		IronBox i3=new IronBox(14,"Havells",23,"purpule");
		System.out.println(i3.id +  i3.name + i3.cost + i3.color);
		System.out.println("----------------------------");
	
		IronBox i4=new IronBox(14,"bajaj",23,"purpule");
		System.out.println(i4.id +  i4.name + i4.cost + i4.color);
		System.out.println("---------------------------");
	}
}
