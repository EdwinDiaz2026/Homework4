package Polymorphism;

public class CargoShip extends Ship {
    private Integer cargoCapacityInTons;

    public CargoShip() {
        this.cargoCapacityInTons = null;
    }

    public void setCargoCapacityInTons(Integer cargoCapacityInTons) {
        if (cargoCapacityInTons >= 0) {
            this.cargoCapacityInTons = cargoCapacityInTons;
        }
        else {
            System.out.println("Capacity value not valid. Must be non-negative. Nothing is set.");
        }
    }

    public Integer getCargoCapacityInTons() {
        return this.cargoCapacityInTons;
    }

    @Override
    public void print() {
        System.out.println("Ship name: " + getName() + ". Cargo Capacity: " + getCargoCapacityInTons() + " tons.");
    }
}
