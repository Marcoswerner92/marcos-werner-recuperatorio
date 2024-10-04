package model;

import enums.typeOfVehicle;

public class vehicleTwoDoors extends Vehicle{
    private typeOfVehicle numberOfDoors = typeOfVehicle.TWO_DOORS;


    public vehicleTwoDoors(Integer id, String carModel, Integer carYear, Integer kmts, Double price) {
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
        return "vehicleTwoDoors{" +
                "numberOfDoors=" + numberOfDoors +
                '}' + super.toString();
    }
}
