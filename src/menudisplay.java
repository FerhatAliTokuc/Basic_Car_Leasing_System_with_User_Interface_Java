public enum menudisplay 
{

	M1("(1) Create new Lease"),
	M2("(2) Display all leases"),
	M3("(3) Calculate total Insurance of Leasing Company"),
	M4("(0) Exit");
	private String displaymenutext;	
	menudisplay(String menutext)
	{
		displaymenutext=menutext;
	}
	String display() 
	{
		return displaymenutext;
	}
}