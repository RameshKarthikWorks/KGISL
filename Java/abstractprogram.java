abstract class abstractprogram
{
	
	public void CustomerInfo()
	{
		
	String name="Ramesh";
	int id=36;
	int address=150;
	}
	
	public String getName();
	{
		return name;
	}
	
	public int getId();
	{
		
		return id;
	}
	
	public String SetName();
	{
		this.name="Ramesh";
	}
	
	
	
	public static void main (String args[])
	{
		
		abstractprogram abs = new abstractprogram();
	
	abs.CustomerInfo();
	}
}

