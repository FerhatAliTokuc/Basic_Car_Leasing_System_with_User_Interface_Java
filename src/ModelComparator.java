import java.util.Comparator;


public class ModelComparator implements Comparator<Insurance> 
{

	public int compare(Insurance car1, Insurance car2) 
	{
		Lease Car1 =(Lease)car1;
		Lease Car2 =(Lease)car2;
		if (Car1.newcar.carBrandModel.equals(Car2.newcar.carBrandModel)) 
		{
				if (Car1.Cost > Car2.Cost)
				{
					return 1;
				}
				else if(Car1.Cost < Car2.Cost) 
				{
					return -1;
				}
				else 
				{
					return 0;
				}
		}
		
		else 
		{
			return Car1.newcar.carBrandModel.compareTo(Car2.newcar.carBrandModel);
		}
	}
	
	
}

/*import java.util.Comparator;
public class ModelComparator implements Comparator<Insurance> {

	//String Car1text ,Car2text;
	public int compare(Insurance car1, Insurance car2) {
		this.Car1text=((Lease)car1).BrandandModel;
		this.Car2text=((Lease)car2).BrandandModel;
		this.Car2text=car1.
		//System.out.println("TEST ÝT "+C);
		 if (Car1text.compareTo(Car2text)>0 )
		 {
			return 1;
		 }
		 if (Car1text.compareTo(Car2text)==0 )
		 {
			return 0;
		 }
		 if (Car1text.compareTo(Car2text)<0 )
		 {
			return -1;
		 }
		 
		else 
		{
			System.out.println("CODE CRASHED");
			return 0;
		}
		
	}

}
*/