package model;

import enums.typeOfVehicle;

public class vehicleThreeDoors extends Vehicle{
    private typeOfVehicle numberOfDoors = typeOfVehicle.THREE_DOORS;

    public vehicleThreeDoors(Integer id, String carModel, Integer carYear, Integer kmts, Double price) {
        super(id, carModel, carYear, kmts, price);
    }

    public typeOfVehicle getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(typeOfVehicle numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "vehicleThreeDoors{" +
                "numberOfDoors=" + numberOfDoors +
                '}' + super.toString();
    }
}
