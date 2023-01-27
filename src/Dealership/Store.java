package Dealership;

import java.util.Arrays;

public class Store {

    Car[] cars;

    public Store(Car[] cars) {
        this.cars = cars;
    }

    public void setCars(int index, Car car) {
        this.cars[index] = car;
    }

    public Car getCars(int index) {
        return this.cars[index] == null ? null : new Car(this.cars[index]);

    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < cars.length; i++) {
            temp += "\tParking positon: " + i+"\n";
            if (cars[i] == null) {
                temp += "\tEmpty\n";
                temp += "\n";
            } else {
                temp += "\t"+cars[i].toString();
                temp += "\n";
            }
        }
        return temp;
    }

    public boolean isEmpty() {
        for (int i = 0; i < cars.length; i++) {
            if (this.cars[i] != null) {
                return false;
            }
        }
        return true;
    }

    public void Sell(int index) {
        if (this.isEmpty()) {
            throw new IllegalStateException("Can not call sell when dealership is Empty");
        }
        this.cars[index] = null;
    }

    public int getLength(){
        return this.cars.length;
    }
}



