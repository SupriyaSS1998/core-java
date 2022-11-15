class Stadium
{
	static String stadiumName[]= {null,null,null,null,null};
	static int i;
	public static void setstadiumName(String name)
	{
		
		if(stadiumName.length>i)
		{
			stadiumName[i]=name;
			i++;
			
		}
		else
		{
			System.out.println("Exceeded");
		}
		
	}
	public static void getstadiumName()
	{
		for(int i=0;i<stadiumName.length;i++) 
		{
			String ref=stadiumName[i];
			System.out.println("Result is "+ref);
		}
		System.out.println("========================= ");
	}
	public static boolean updatestadiumName(String oldname,String newname)
	{
		if(oldname!=null && newname!=null)
		{
			for(int i=0;i<stadiumName.length;i++) 
			{
				if(stadiumName[i]==oldname) 
				{
					System.out.println("old name is  "+stadiumName[i]);
					stadiumName[i]=newname;
					System.out.println("new name is "+stadiumName[i]);
					return true;
				}
			}
		}
		return false;
		
	}

	public static boolean updatestadiumName(String newname,int existingname) 
	{
		if(newname!=null && existingname!=-1) 
		{
			for(int i=0;i<stadiumName.length;i++) 
			{
				if(i==existingname)
				{
					for(int a=1;a<stadiumName.length;a++) 
					{
						System.out.println("name is "+existingname);
						stadiumName[i]=newname;
						System.out.println("name is "+newname);
						return true;
						
						
					}
				}
			}
		}
			return false;
		
		
	}
	}