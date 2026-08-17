package java_roadmap.week2;

import java.util.Scanner;

public class ParkingSystem1603 {

    private int big;
    private int medium;
    private int small;

    private int maxBig;
    private int maxMedium;
    private int maxSmall;

    ParkingSystem1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;

        this.maxBig = big;
        this.maxMedium = medium;
        this.maxSmall = small;
    }


    public boolean addCar(int carType) {
        if (carType == 1) {
            if (this.big > 0) {
                big--;
                return true;
            } else {
                return false;
            }
        }

            if(carType == 2) {
                if (this.medium > 0) {
                    medium--;
                    return true;
                } else {
                    return false;
                }
            }

            if (carType == 3) {
                if (this.small > 0) {
                    small--;
                    return true;
                } else {
                    return false;
            }
        }
        return false;
    }

    public boolean removeCar(int carType) {
        if (carType == 1) {
            if (this.big < maxBig) {
                big++;
                return true;
            }
        }

        if (carType == 2) {
            if (this.medium < maxMedium) {
                medium++;
                return true;
            }
        }

        if (carType == 3) {
            if (this.small <  maxSmall) {
                small++;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        ParkingSystem1603 ps = new ParkingSystem1603(2, 2, 2);

        if (ps.addCar(1)) {
            System.out.println("Car added successfully");
        } else {
            System.out.println("Space already occupied");
        }

        if (ps.addCar(2)) {
            System.out.println("Car added successfully");
        } else {
            System.out.println("Space already occupied");
        }

        if (ps.addCar(3)) {
            System.out.println("Car added successfully");
        } else {
            System.out.println("Space already occupied");
        }

        if (ps.addCar(1)) {
            System.out.println("Car added successfully");
        } else {
            System.out.println("Space already occupied");
        }

        if (ps.addCar(1)) {
            System.out.println("Car added successfully");
        } else {
            System.out.println("Space already occupied");
        }

        if (ps.removeCar(1)) {
            System.out.println("Car removed successfully");
        } else {
            System.out.println("Car already removed");
        }

        if (ps.addCar(1)) {
            System.out.println("Car added successfully");
        } else {
            System.out.println("Space already occupied");
        }






        input.close();
    }

}