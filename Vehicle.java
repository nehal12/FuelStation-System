
public class Vehicle {
	
	    String fuelType;
	    double quantRequired;
	    FuelStation stationToGo;
	    
	  
	    public void setFuelStationToGo(FuelStation station)
	    {
	        this.stationToGo = station;
	    }
	    
	    public void askForFuel()
	    {
	        this.stationToGo.sellFuel(this.quantRequired, this.fuelType);
	    }
	}


	 

