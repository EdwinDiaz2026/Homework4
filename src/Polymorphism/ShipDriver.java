package Polymorphism;

public class ShipDriver {
    static Ship[] shipArray = new Ship[3];

    public static void main(String[] args){
        shipArray[0] = new Ship();
        shipArray[1] = new CruiseShip();
        shipArray[2] = new CargoShip();

        Ship myShip = shipArray[0];
        myShip.setName("Ship");
        myShip.setYearBuilt("2005");

        CruiseShip myCruiseShip = (CruiseShip) shipArray[1];
        myCruiseShip.setName("Cruise Ship");
        myCruiseShip.setYearBuilt("1992");
        myCruiseShip.setMaxNumberOfPassengers(500);

        CargoShip myCargoShip = (CargoShip) shipArray[2];
        myCargoShip.setName("Cargo Ship");
        myCargoShip.setYearBuilt("1985");
        myCargoShip.setCargoCapacityInTons(20000);

        for (Ship ship : shipArray) {
            ship.print();
        }

    }
}
