package Polymorphism;

public class CruiseShip extends Ship {
    private Integer maxNumberOfPassengers;

    public CruiseShip() {
        this.maxNumberOfPassengers = null;
    }

    public void setMaxNumberOfPassengers(Integer maxNumberOfPassengers) {
        if (maxNumberOfPassengers >= 0) {
            this.maxNumberOfPassengers = maxNumberOfPassengers;
        }
        else {
            System.out.println("Max # of passengers is not valid. Must be non-negative. Nothing is set.");
        }
    }

    public Integer getMaxNumberOfPassengers() {
        return this.maxNumberOfPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship name: " + getName() + ". Max number of passengers: " + getMaxNumberOfPassengers());
    }
}
