public class TruckDriver{
	protected String driverName = "TruckDriver";
	
	public void drive(HeavyCar Hcar){
		System.out.println(driverName + ":: Driving " + Hcar.name());	
	}
	
	public void loadCargo(HeavyCar Hcar){
		System.out.println(driverName + ":: Loading cargo into truck with capacity "+ Hcar.getCargoCapacity() + " tons");	
	}
	
	public void drive(LightweightCar Lcar){
		System.out.println(driverName + ":: Amazingly driving " + Lcar.name());	
	}
}