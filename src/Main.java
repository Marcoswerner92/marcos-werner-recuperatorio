import java.util.ArrayList;
import java.util.List;

import model.*;


public class Main {
    public static void main(String[] args) {


        // Create a rent list to save all the rents.

        List<Rent> rentList = new ArrayList<>();

        // Create vehicles to check the system.

        Vehicle car1 = new vehicleTwoDoors(1, "BMW", 2019, 10000, 10000.00);
        Vehicle car2 = new vehicleTwoDoors(2, "Mercedes", 2020, 20000, 20000.00);
        Vehicle car3 = new vehicleThreeDoors(3, "Audi", 2021, 30000, 30000.00);
        Vehicle van1 = new Van(4, "VW", 2022, 40000, 40000.00);
        Vehicle van2 = new Van(5, "Opel", 2023, 50000, 50000.00);


        // Create some clientes to validate.

        Client client1 = new Client("Juan", "Perez", 1, true);
        Client client2 = new Client("Pedro", "Sanchez", 2, false);
        Client client3 = new Client("Sandra", "Garcia", 3, true);

        // Now let´s create some rents, checking if the clients have a valid license.

        if (client1.isLicenseCheck() == true) {
            Rent rent1 = new Rent(5, client1.getName(), client1.getId(), car1, "Mar del Plata", "Mar del Plata");
            rent1.setRentalPrcie(rent1, 300); //This client use the card for 300 kmts.
            rentList.add(rent1);
        } else {
            System.out.println("The client doesn't have a valid license.");
        }
        if (client1.isLicenseCheck() == true) {
            Rent rent2 = new Rent(3, client3.getName(), client3.getId(), car1, "Mar del Plata", "Buenos Aires");
            rent2.setRentalPrcie(rent2, 150); //This client use the card for 150 kmts.
            rentList.add(rent2);
        } else {
            System.out.println("The client doesn't have a valid license.");
        }

        // We could create a function to scale the rental approach, but I´m out of time at this moment.

        // Let´s check the most expensive rent.

        double maxRental = 0;
        int index = 0;

        for (Rent r : rentList) {
            if (r.getRentalPrice() > maxRental) {
                index = rentList.indexOf(r);
            }
        }

        System.out.println("The most expensive rent was: " + rentList.get(index));

        // Let´s see the amount of rentals per type of vehicle.

        int vehicleTwoDoors = 0;
        int vehicleThreeDoors = 0;
        int vehicleVan = 0;

        for (Rent r : rentList) {
            if (r.getVehicle() instanceof vehicleTwoDoors) {
                vehicleTwoDoors++;
            } else {
                if (r.getVehicle() instanceof vehicleThreeDoors) {
                    vehicleThreeDoors++;
                }
            }
            if (r.getVehicle() instanceof Van) {
                vehicleVan++;
            }
        }
        System.out.println("The amount of rents for Two Doors: " + vehicleTwoDoors);
        System.out.println("The amount of rents for Three Doors: " + vehicleThreeDoors);
        System.out.println("The amount of rents for Vans: " + vehicleVan);
    }
}


