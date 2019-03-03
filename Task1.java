

public class Task1 {
    public static void main(String[] args){

	CarDriver carDriver = new CarDriver();
    TruckDriver truckDriver = new TruckDriver();

    carDriver.drive(new BMW());
    carDriver.drive(new Mercedes());

    // carDriver.drive(new Iveco()); // compile time error

    truckDriver.drive(new BMW());
    truckDriver.drive(new Iveco());
    // truckDriver.loadCargo(new BMW()); //compile time error
    truckDriver.loadCargo(new Iveco());
}
}