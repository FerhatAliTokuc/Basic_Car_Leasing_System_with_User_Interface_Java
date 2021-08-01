public class Car implements Insurance
{

	public String carBrandModel;
	public int carModelYear;
	public int baseyearforinsurance;
	public int price;
	public Car(String carmodel,int carmodelyear)
	{
		this.carBrandModel=carmodel;
		this.carModelYear=carmodelyear;
	}
	public int calculateInsurance() 
	{
		if(carModelYear>2000) 
		{
			baseyearforinsurance= carModelYear -2000;
			price=100*baseyearforinsurance;
			
		}
		else 
		{
			price=0;
		}
	
		return price;	
	}
}
