package model;

import enums.typeOfVehicle;

public class Van extends Vehicle{
    private typeOfVehicle numberOfDoors = typeOfVehicle.VAN;


    public Van(Integer id, String carModel, Integer carYear, Integer kmts, Double price) {
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
        return "Van{" +
                "numberOfDoors=" + numberOfDoors +
                '}' + super.toString();
    }
}
