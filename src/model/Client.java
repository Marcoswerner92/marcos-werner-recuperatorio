package model;

public class Client {
    private String name;
    private String surname;
    private Integer id;
    private boolean licenseCheck;

    public Client(String name, String surname, Integer id, boolean licenseCheck) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.licenseCheck = licenseCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isLicenseCheck() {
        return licenseCheck;
    }

    public void setLicenseCheck(boolean licenseCheck) {
        this.licenseCheck = licenseCheck;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", licenseCheck=" + licenseCheck +
                '}';
    }
}
