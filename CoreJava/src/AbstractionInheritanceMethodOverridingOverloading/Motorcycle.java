package AbstractionInheritanceMethodOverridingOverloading;

public class Motorcycle extends Vehicle{
	
	boolean hasFairing;
	
	@Override
	public void accelerate() {
		System.out.println("MotorCycle is Accelerating");
	}
	@Override
	protected void break_() {
		System.out.println("MotorCycle Hydraulic break Available");		
	}
	public Motorcycle() {
	}
	public Motorcycle(boolean hasFairing,String make, String model) {
		super();
		this.hasFairing = hasFairing;
		this.make = make;
		this.model = model;
		
	}
}