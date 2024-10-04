package model;

import model.*;

public class Rent {
    private Integer rentalDays;
    private String clientName;
    private Integer clientId;
    private Vehicle vehicle;
    private Double rentalPrice;
    private String cityPickup;
    private String cityReturn;

    public Rent(Integer rentalDays, String clientName, Integer clientId, Vehicle vehicle, String cityPickup, String cityReturn) {
        this.rentalDays = rentalDays;
        this.clientName = clientName;
        this.clientId = clientId;
        this.vehicle = vehicle;
        this.cityPickup = cityPickup;
        this.cityReturn = cityReturn;
    }

    public Integer getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(Integer rentalDays) {
        this.rentalDays = rentalDays;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getCityPickup() {
        return cityPickup;
    }

    public void setCityPickup(String cityPickup) {
        this.cityPickup = cityPickup;
    }

    public String getCityReturn() {
        return cityReturn;
    }

    public void setCityReturn(String cityReturn) {
        this.cityReturn = cityReturn;
    }

    public void setRentalPrcie(Rent rent, Integer kmts) {
        setRentalPrice((double) (rent.rentalDays * kmts));
        this.rentalPrice = (double) (rent.rentalDays * kmts);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentalDays=" + rentalDays +
                ", clientName='" + clientName + '\'' +
                ", clientId=" + clientId +
                ", vehicle=" + vehicle +
                ", rentalPrice=" + rentalPrice +
                ", cityPickup='" + cityPickup + '\'' +
                ", cityReturn='" + cityReturn + '\'' +
                '}';
    }
}
