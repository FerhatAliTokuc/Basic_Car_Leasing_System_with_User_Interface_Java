//FERHAT ALÝ TOKUÇ 20180702071
abstract public class Lease implements Insurance
{
	public 	String BrandandModel;
	public 	int Leasestart;
	public 	int Leaseend;
	public 	int Cost;
	public  String defaultcarname="Renault Clio";
	public  int defaultcarcost=200;
	public 	static int leasecount=0;
	public 	int modelyear;
	//car 
	public Car newcar;
	public Lease() {
		
		
	}
	public 	Lease(int modelyear,String brandandmodel,int Leasestart,int Leaseends,int MonthlyCost) 
	{
		newcar=new Car(brandandmodel,modelyear);
		
		//car.carBrandModel=brandandmodel;
		//car.carModelYear=modelyear;
		//this.BrandandModel=brandandmodel;
		this.Leasestart	  =Leasestart;
		this.Leaseend	  =Leaseends;
		this.Cost  =MonthlyCost;
		//leasecount++;
		 
	}
	public Lease(int Leasestart,int Leaseends) 
	{
		this.BrandandModel=defaultcarname;
		this.Leasestart	  =Leasestart;
		this.Leaseend	  =Leaseends;
		this.Cost  =defaultcarcost;
		//leasecount++;
	}
	
	
	public int calculateInsurance() {
		// Gülþah hocaya sor ?
		//bence override yapacaðýz burasý boþta olur
		return 0;
	}
	
	
	public abstract String show(String text);
	
		//System.out.printf("%s, is leased for %d months.Montly cost is %d $\n",this.BrandandModel,this.Leaseend-this.Leasestart+1,this.Cost);
	
	//Code part canceled because we use only 1 labwork
	/*
	public void displayleasecount() 
	{
		//System.out.println(leasecount+" Leases have been created so far");
		
	}*/
}
