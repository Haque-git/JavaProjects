package CSE111.Assignment_09;

public class Garage {
    
    int carCapaciity;
    int carCount;
    int bikeCapacity;
    int bikeCount;

    Car[] cars;
    Bike[] bikes;

    public Garage(int carCapaciity, int bikeCapacity) {
        this.carCapaciity = carCapaciity;
        this.bikeCapacity = bikeCapacity;
        cars = new Car[this.carCapaciity];
        bikes = new Bike[this.bikeCapacity];
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            if (this.carCount < this.carCapaciity) {
                cars[carCount] = (Car)vehicle;
                carCount++;
                return;
            }
            return;
        }

        if (vehicle instanceof Bike) {
            if (this.bikeCount < this.bikeCapacity) {
                bikes[bikeCount] = (Bike)vehicle;
                bikeCount++;
                return;
            }
            return;
        }
    }
}
