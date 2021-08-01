public class ShortTermLease extends Lease
{
		public 	int DailyCost;
		public 	int howmanyday;
		public Car car;
		public ShortTermLease(){
		
		}
	
		public 	ShortTermLease(int modelyear,String brandandmodel,int Leasestart,int Leaseends,int Costinput) {
			super(modelyear,brandandmodel,Leasestart,Leaseends,Costinput);
			DailyCost=Costinput;
			howmanyday=(Leaseends-Leasestart)+1;
		}
	
		public String show(String text)
		{
		
			text=newcar.carBrandModel+", is leased for "+(this.Leaseend-this.Leasestart+1)+" days.Daily cost is "+this.DailyCost+"$\n";
			return text;
		}

		public int calculateInsurance() 
		{
			//howmanyday*
			return ((DailyCost)*15)/100;
		}



}


