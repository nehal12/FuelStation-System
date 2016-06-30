
public class FuelStation {
	    String fuelType;
	    double fuelPrice;
	    double quantityAvailable;
	    
	   public void sellFuel(double quantityDemanded, String type)
	    {
	        if(type!=fuelType)
	        {
	        	System.out.println("Sorry, this fuel station doesnot have type of fuel required by your vehicle");
	        	
	        }
	        if(quantityDemanded>quantityAvailable)
	        {
	        	System.out.println("Sorry, the amount of fuel demanded is not available with us.");
	        }
	        else
	        	quantityAvailable = quantityAvailable - quantityDemanded;
	        
	        
	            /*Fill in conditional statements that would check, whether the fuel type and quantity is available at the station or not
	              If not available, print an appropriate message for the user to know.
	              Otherwise deduct the fuel required from the total fuel available and call the 'transactionDetails' function to print the details */

          
	        transactionDetails(quantityDemanded);

	    }
	    
	    private void transactionDetails(double quantityDemanded)
	    {
	    	double bill = fuelPrice*quantityDemanded;
	    	
	    	System.out.println("Fuel demanded by you is filled in your vehicle. Total amount :" +bill );
	        /*Calculate the bill and store it in a variable named 'bill'.
	          Print the details of the bill. */

	    }
	}
