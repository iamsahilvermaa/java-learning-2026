package java_roadmap.week2;

import java.util.Scanner;

enum VehicleType {
    BIKE,
    CAR,
    SCOOTY;
}

class Vehicle {
    String licensePlate;
    VehicleType vehicleType;

    Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

}

class Bike extends Vehicle {
    Bike(String licensePlate, VehicleType vehicleType) {
        super(licensePlate, vehicleType);
    }
}

class Scooty extends Vehicle {
    Scooty(String licensePlate, VehicleType vehicleType) {
        super(licensePlate, vehicleType);
    }
}

class Car extends Vehicle {
    Car(String licensePlate, VehicleType vehicleType) {
        super(licensePlate, vehicleType);
    }
}

class ParkingLotSystem {

    private Vehicle[] spot;

    ParkingLotSystem(int totalSpots) {
        spot = new Vehicle[totalSpots];
    }

    boolean park(Vehicle v) {
        for (int i = 0; i < spot.length; i++) {
            if (this.spot[i] == null) {
                spot[i] = v;
                return true;
            }
        }
        return false;
    }

    boolean unpark(String licensePlate) {
        for (int i = 0; i < spot.length; i++) {
            if (this.spot[i] != null && spot[i].licensePlate.equals(licensePlate)) {
                spot[i] = null;
                return true;
            }
        }
        return false;

    }

    public void displayParkingLot() {
        for (int i = 0; i < spot.length; i++) {
            if (spot[i] == null) {
                System.out.println("SPOT " + i + ": EMPTY");
            } else {
                System.out.println("SPOT " + i + ": " +
                        spot[i].vehicleType + " - " +
                        spot[i].licensePlate);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();

        ParkingLotSystem pl = new ParkingLotSystem(5);

        boolean running = true;

        while (running) {
            System.out.println("\nMain Menu\n" +
                    "1. Display Parking Lot\n" +
                    "2. Park\n" +
                    "3. Unpark\n" +
                    "4. Exit");


            String choice = input.next().toLowerCase();

            switch (choice) {
                case "1":
                    System.out.println();
                    pl.displayParkingLot();
                    break;
                case "2":
                    System.out.println("Enter the Vehicle Type: ");
                    VehicleType vehicleType = VehicleType.valueOf(input.next().toUpperCase());

                    System.out.println("Enter the licensePlate : ");
                    String licensePlate = input.next().toUpperCase();


                    Vehicle vehicle;

                    switch (vehicleType) {
                        case BIKE:
                            vehicle = new Bike(licensePlate, VehicleType.BIKE);
                            break;
                        case CAR:
                            vehicle = new Car(licensePlate, VehicleType.CAR);
                            break;
                        case SCOOTY:
                            vehicle = new Scooty(licensePlate, VehicleType.SCOOTY);
                            break;
                        default:
                            vehicle = null;
                    }


                    boolean parked = pl.park(vehicle);


                    System.out.println();

                    if (parked) {
                        System.out.println("Vehicle parked successfully");
                    } else {
                        System.out.println("Parking Lot is full");
                    }

                    System.out.println();


                    System.out.println("--Parking Lot--");
                    pl.displayParkingLot();


                    System.out.println();
                    break;
                case "3":
                    System.out.println("Enter license plate to unpark: ");
                    String removePlate = input.next().toUpperCase();


                    boolean unparked = pl.unpark(removePlate);
                    if (unparked) {
                        System.out.println("Vehicle unparked successfully");
                    } else {
                        System.out.println("No vehicle found");
                    }

                    System.out.println();

                    System.out.println("Parking Lot After Unparked");
                    pl.displayParkingLot();
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }

        input.close();
    }
}
