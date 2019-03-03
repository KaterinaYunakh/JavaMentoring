public class CarDriver{
	
	protected String driverName = "CarDriver";
	
	public void drive(LightweightCar Lcar){
		System.out.println(driverName + ":: Driving " + Lcar.name());	
	}
}