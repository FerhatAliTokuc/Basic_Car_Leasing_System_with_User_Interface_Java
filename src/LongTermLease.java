public class LongTermLease extends Lease 
{
	int  howmanyyear;
	public int YearlyCost;
	//public Car car;
	public LongTermLease(){

	}

	public 	LongTermLease(int modelyear,String brandandmodel,int Leasestart,int Leaseends,int Costinput) {
		super(modelyear,brandandmodel,Leasestart,Leaseends,Costinput);
		YearlyCost=Costinput;
		howmanyyear = (Leaseends-Leasestart)+1;
		
	}
	public String show(String text)
	{
		System.out.printf("%s, is leased for %d years.Yearly cost is %d $\n",newcar.carBrandModel,(this.Leaseend-this.Leasestart+1),this.YearlyCost);
		text=newcar.carBrandModel+", is leased for "+(this.Leaseend-this.Leasestart+1)+" years.Yearly cost is "+this.YearlyCost+"$\n";
		return text;
	}
	public int calculateInsurance() 
	{
		//howmanyyear*
		return ((YearlyCost)*35)/100;
		
	}

}
