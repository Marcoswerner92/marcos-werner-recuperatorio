package model;

public abstract class Vehicle {
    private Integer id;
    private String carModel;
    private Integer carYear;
    private Integer kmts;
    private Double price;

    public Vehicle(Integer id, String carModel, Integer carYear, Integer kmts, Double price) {
        this.id = id;
        this.carModel = carModel;
        this.carYear = carYear;
        this.kmts = kmts;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    public Integer getKmts() {
        return kmts;
    }

    public void setKmts(Integer kmts) {
        this.kmts = kmts;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
