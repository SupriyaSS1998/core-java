class IndianRupeeTester{
		public static void main(String a[]){
		
		IndianRupee ind = new IndianRupee();
		
		ind.serialno = "4566890";
		ind.color = "Green";
		ind.name = "20 Rupee";
		
		
		System.out.println("ind.serialno is "+ind.serialno);
		System.out.println("ind.color is "+ind.color);
		System.out.println("ind.name is "+ind.name);
		
		IndianRupee ind1 = new IndianRupee();
		
		ind1.serialno = "4566890";
		ind1.color = "Olive green";
		ind1.name = "40 Rupee";
		
		System.out.println("ind1.serialno is "+ind1.serialno);
		System.out.println("ind1.color is "+ind1.color);
		System.out.println("ind1.name is "+ind1.name);
		

		}
	}