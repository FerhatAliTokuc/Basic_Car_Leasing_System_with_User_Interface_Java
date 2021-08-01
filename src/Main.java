import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
import java.util.InputMismatchException;
//Ferhat Ali Tokuç 20180702071
// LABWORK NONE   21/05/2021 18:16 edition
// GUI task
public class Main 
{ 
	public static void main(String[] args) 
	{
		int totalinsuranceprice=0;
		//ArrayList<Lease> cars = new ArrayList<Lease>();
		ArrayList<Insurance> cars2 = new ArrayList<>();
		//Lease arraylease[];
		//arraylease =new Lease[10];
		//Store edilebilecek mak bilgi=10 class kümesi
		System.out.println("Welcome to Car Leasing System");
		int arraylocation=0;
		int userinput = 0;
		int userinput2;
		int userchoice=212;
		int userchoicesub=212;
		
		//sonusz dongu
		Scanner scanner=new Scanner(System.in);
		String submenu2;
		
		String BrandandModel;	
		String LeaseStarts;
		String LeaseEnds;
		String MonthlyCost;
		String ModelYear;
		int LeaseStartsint;
		int LeaseEndsint;
		int MonthlyCostint;
		int ModelYearint;
		while(true) {
			String menu = JOptionPane.showInputDialog(null,"(1) Create new Lease \n(2) Display all leases\n"
					+ "(3) Calculate total Insurance of Leasing Company\n(0) Exit","Car Leasing System",JOptionPane.PLAIN_MESSAGE);
				try {
					userchoice=Integer.parseInt(menu);
					
				}catch(InputMismatchException e) {
					userinput=999;
					System.err.println("Wrong Input. You should type a number");
					scanner.nextLine();
					
				}

				if(userchoice==1)
				{
					
					 submenu2 = JOptionPane.showInputDialog(null,"(1) Create a MidTermLease\n(2) Create a ShortTermLease\n"
							+ "(3) Create a LongTermLease","Choose a Leasing Type",JOptionPane.PLAIN_MESSAGE);
				
					try {
						userinput2=Integer.parseInt(submenu2);
						

						
					}
					catch(InputMismatchException e) 
					{
						userinput2=999;
						System.err.println("Wrong Input. You should type a number");
						scanner.nextLine();
						
					}

					if(userinput2==1) 
					{
						
						BrandandModel = JOptionPane.showInputDialog(null,"Brand and Model:","Brand and Model:",JOptionPane.PLAIN_MESSAGE); // String kalsýn
						LeaseStarts = JOptionPane.showInputDialog(null,"Lease Starts:","Lease Starts:",JOptionPane.PLAIN_MESSAGE);
						LeaseStartsint=Integer.parseInt(LeaseStarts);
						LeaseEnds = JOptionPane.showInputDialog(null,"Lease Ends:","Lease Ends:",JOptionPane.PLAIN_MESSAGE);
						LeaseEndsint =Integer.parseInt(LeaseEnds);
						MonthlyCost = JOptionPane.showInputDialog(null,"Monthly Cost:","Monthly Cost:",JOptionPane.PLAIN_MESSAGE);
						MonthlyCostint=Integer.parseInt(MonthlyCost);
						ModelYear = JOptionPane.showInputDialog(null,"Model Year","Model Year",JOptionPane.PLAIN_MESSAGE);
						ModelYearint=Integer.parseInt(ModelYear);
						cars2.add(new MidTermLease(ModelYearint,BrandandModel,LeaseStartsint,LeaseEndsint,MonthlyCostint));
						arraylocation=arraylocation+1;
						totalinsuranceprice+=new MidTermLease(ModelYearint,BrandandModel,LeaseStartsint,LeaseEndsint,MonthlyCostint).calculateInsurance()+new Car(BrandandModel,ModelYearint).calculateInsurance();
					}
					else if(userinput2==2) {//ShortTermLease
						BrandandModel = JOptionPane.showInputDialog(null,"Brand and Model:","Brand and Model:",JOptionPane.PLAIN_MESSAGE); // String kalsýn
						LeaseStarts = JOptionPane.showInputDialog(null,"Lease Starts:","Lease Starts:",JOptionPane.PLAIN_MESSAGE);
						LeaseStartsint=Integer.parseInt(LeaseStarts);
						LeaseEnds = JOptionPane.showInputDialog(null,"Lease Ends:","Lease Ends:",JOptionPane.PLAIN_MESSAGE);
						LeaseEndsint =Integer.parseInt(LeaseEnds);
						MonthlyCost = JOptionPane.showInputDialog(null,"Daily Cost:","Daily Cost:",JOptionPane.PLAIN_MESSAGE);
						MonthlyCostint=Integer.parseInt(MonthlyCost);
						ModelYear = JOptionPane.showInputDialog(null,"Model Year","Model Year",JOptionPane.PLAIN_MESSAGE);
						ModelYearint=Integer.parseInt(ModelYear);
						cars2.add(new ShortTermLease(ModelYearint,BrandandModel,LeaseStartsint,LeaseEndsint,MonthlyCostint));
						arraylocation=arraylocation+1;
						totalinsuranceprice+=new ShortTermLease(ModelYearint,BrandandModel,LeaseStartsint,LeaseEndsint,MonthlyCostint).calculateInsurance()+new Car(BrandandModel,ModelYearint).calculateInsurance();
					}
					else if(userinput2==3) {//LongTermLease
						BrandandModel = JOptionPane.showInputDialog(null,"Brand and Model:","Brand and Model:",JOptionPane.PLAIN_MESSAGE); // String kalsýn
						LeaseStarts = JOptionPane.showInputDialog(null,"Lease Starts:","Lease Starts:",JOptionPane.PLAIN_MESSAGE);
						LeaseStartsint=Integer.parseInt(LeaseStarts);
						LeaseEnds = JOptionPane.showInputDialog(null,"Lease Ends:","Lease Ends:",JOptionPane.PLAIN_MESSAGE);
						LeaseEndsint =Integer.parseInt(LeaseEnds);
						MonthlyCost = JOptionPane.showInputDialog(null,"Yearly Cost:","Yearly Cost:",JOptionPane.PLAIN_MESSAGE);
						MonthlyCostint=Integer.parseInt(MonthlyCost);
						ModelYear = JOptionPane.showInputDialog(null,"Model Year","Model Year",JOptionPane.PLAIN_MESSAGE);
						ModelYearint=Integer.parseInt(ModelYear);
						cars2.add(new LongTermLease(ModelYearint,BrandandModel,LeaseStartsint,LeaseEndsint,MonthlyCostint));
						arraylocation=arraylocation+1;
						totalinsuranceprice+=new LongTermLease(ModelYearint,BrandandModel,LeaseStartsint,LeaseEndsint,MonthlyCostint).calculateInsurance()+new Car(BrandandModel,ModelYearint).calculateInsurance();
					}
					
				}
				
				
		
				
				
				else if(userchoice==2) 
				{
					Collections.sort(cars2,new ModelComparator());
					Iterator<Insurance> itr=cars2.iterator();
					String userinputtext="";
					String userinputtext2="";
					while(itr.hasNext()) 
					{
						
					Insurance temp=itr.next();
					//System.out.println(temp);	
						if(temp instanceof ShortTermLease) 
						{
							Lease temp2=(ShortTermLease)temp;
							userinputtext2=userinputtext2+temp2.show(userinputtext);
							
							
						}
						else if(temp instanceof LongTermLease) 
						{
							
							Lease temp2=(LongTermLease)temp;
							userinputtext2=userinputtext2+temp2.show(userinputtext);
							
							
						}
						else if(temp instanceof MidTermLease) 
						{
							
							Lease temp2=(MidTermLease)temp;
							userinputtext2=userinputtext2+temp2.show(userinputtext);
						
							
						}
					
					}
					 JOptionPane.showMessageDialog(null,userinputtext2,"Display All Leases",JOptionPane.PLAIN_MESSAGE);
					
				}
				else if(userchoice==3) 
				{
					System.out.println("Total insurance: "+totalinsuranceprice);
					JOptionPane.showMessageDialog(null,"Total insurance: "+totalinsuranceprice,"Total insurance",JOptionPane.PLAIN_MESSAGE);
				}
				else if(userchoice==0) {
					System.out.println("You choose exit . Have a nice day");
					System.exit(0);
				}
				
				/*else 
				{
					System.out.println("You choose wrong input.Please try again");
				}*/
			
		}
		
			
		
	}
}
