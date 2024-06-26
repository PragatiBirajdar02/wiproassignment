package AbstractionInheritanceMethodOverridingOverloading;

public class AllVehicleMain {

	public static void main(String[] args) {
	
		Car myCar = new Car(4,"Toyota", "Camry");
	        System.out.println("Car Make: " + myCar.make);
	        System.out.println("Car Model: " + myCar.model);
	        System.out.println("Number of doors: " + myCar.numOfDoors);
	        myCar.accelerate();
	        myCar.break_();
			
	      

	       
	      
	    Motorcycle myMotorcycle = new Motorcycle(true,"Honda", "CBR600RR" );
	        System.out.println("Motorcycle Make: " + myMotorcycle.make);
	        System.out.println("Motorcycle Model: " + myMotorcycle.model);
	        System.out.println("Has Fairing: " + (myMotorcycle.hasFairing ? "Yes" : "No"));
	        myMotorcycle.accelerate();
	        myMotorcycle.break_();

	}

}
