
import javax.swing.JOptionPane;
public class U1L04HotelCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We're going the moon!");
		int numNight;
		
		do 
		{
			String input = JOptionPane.showInputDialog(null, "How many nights do you plan to stay: ");
			numNight = Integer.parseInt(input);
		}
		while ( numNight < 0);
		{
			int rocksCarlton = 700;
			int moonMotel = 70;
			int apolloHotel = 150;
			//System.out.println(numNight);
			
			int rockCost = 700 * numNight;
			int moonCost = 70 * numNight;
			int apolloCost = 150 * numNight;
			
			System.out.println("The cost for " + numNight + " nights:");
			
			String rockBar = "";
			int rockVar = rockCost;
			
			while (rockVar > 0)
			{
				rockVar = rockVar - 50;
				rockBar += "* "; 	
			}
			System.out.println("The Rocks Carlton: " + rockBar + "" + rockCost);
			
			String moonBar = "";
			int moonVar = moonCost;
			
			while (moonVar > 0)
			{
				moonVar = moonVar - 50;
				moonBar += "* "; 	
			}
			System.out.println("The Moon Motel: " + moonBar + "" + moonCost);
			
			String apolloBar = "";
			int apolloVar = apolloCost;
			
			while (apolloVar > 0)
			{
				apolloVar = apolloVar - 50;
				apolloBar += "* "; 	
			}
			System.out.println("The Apollo Hotel: " + apolloBar + "" + apolloCost);
			
			
			//System.out.println("For " + numNights + " it will cost: ");
			//System.out.println(rockCost + " " + moonCost + " " + apolloCost + "");
		}
		
	
		
		
	}

}
