public class MidTermLease extends Lease 
{
	public int MidTermLeaseCost;
	public int howmanymounth;
	public Car car;
	public MidTermLease(){
	
	}

	public 	MidTermLease(int modelyear,String brandandmodel,int Leasestart,int Leaseends,int Costinput) 
	{
		super(modelyear,brandandmodel,Leasestart,Leaseends,Costinput);
		MidTermLeaseCost=Costinput;
		howmanymounth=(Leaseends-Leasestart)+1;
	}
	public String show(String text)
	{
		System.out.printf("%s, is leased for %d Monthly.Monthly cost is %d $\n",newcar.carBrandModel,(this.Leaseend-this.Leasestart+1),this.MidTermLeaseCost);
		text=newcar.carBrandModel+", is leased for "+(this.Leaseend-this.Leasestart+1)+" Monthly.Monthly cost is "+this.MidTermLeaseCost+"$\n";
	return text;
	}
	
	public int calculateInsurance() 
	{
		//howmanymounth*
		return ((MidTermLeaseCost)*25)/100;
	}

}
	

