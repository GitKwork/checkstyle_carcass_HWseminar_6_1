/**
 * 1603. Design Parking System
 * Design a parking system for a parking lot. The parking lot has three kinds of parking spaces:
 * big, medium, and small, with a fixed number of slots for each size.
 * <p>
 * Implement the ParkingSystem class:
 * <p>
 * ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class.
 * The number of slots for each parking space are given as part of the constructor.
 * bool addCar(int carType) Checks whether there is a parking space of carType for the car that
 * wants to get into the parking lot. carType can be of three kinds: big, medium, or small, which
 * are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType.
 * If there is no space available, return false, else park the car in that size space and return true.
 */

import java.util.*;
import java.lang.*;

public class Main {

    public void main(String args[]) {
        boolean isFormatted = false;
        String request = "пожалуйста форматируйте код";
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        System.out.print(obj.addCar(1) + " ");
        System.out.print(obj.addCar(2) + " ");
        System.out.print(obj.addCar(3) + " ");
    }

    class ParkingSystem {
        int big, medium, small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if (carType == 1) {
                if (big == 0) return false;
                big--;
            } else if (carType == 2) {
                if (medium == 0) return false;
                medium--;

            } else {
                if (small == 0) return false;
                small--;

            }
            return true;
        }
    }
}
