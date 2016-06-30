
public class Tester {
	 public static void main(String[] args) 
	 
	 {
		 
		 FuelStation station1 = new FuelStation();
		 station1.fuelType="Petrol";
		 station1.fuelPrice= 55;
		 station1.quantityAvailable=100;
		 
		 
		 FuelStation station2 = new FuelStation();
		 station2.fuelType="Diesel";
		 station2.fuelPrice= 50;
		 station1.quantityAvailable=120;
		 
		 FuelStation station3 = new FuelStation();
		 station3.fuelType="Petrol";
		 station3.fuelPrice= 55;
		 station1.quantityAvailable=70;
		 
		 Vehicle v1 =new Vehicle();
		 v1.fuelType="Petrol";
		 v1.quantRequired=90;
		 v1.stationToGo=station1;
		 
		 
		 
		 Vehicle v2 =new Vehicle();
		 v2.fuelType="Petrol";
		 v2.quantRequired=65;
		 v2.stationToGo=station3;
		 
		 Vehicle v3 =new Vehicle();
		 v3.fuelType="Diesel";
		 v3.quantRequired=110;
		 v3.stationToGo=station3;
	
		 
		 
	        //Creat 3 objects of both FuelStation class and Vehicle class here.
	        //Assign appropriate values to their respective variables.
	        
            v1.askForFuel();
            v2.askForFuel();
            v3.askForFuel();
            
            
            
          
	        //call askForFuel function using all the three vehicles.


	        v1.setFuelStationToGo(station2); 
	        v3.setFuelStationToGo(station1);
	        
	        v1.askForFuel();
	        v3.askForFuel();
	        
	        
	        //This changes the fuel station of vehicle 1 to station-2
	        //similarly change the fuel station of vehicle 3 to station-1.

	        //And then again ask for Fuel using vehicle 1 and vehicle 3.
	       
	    }
	}






