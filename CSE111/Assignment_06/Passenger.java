// task: 6.2

package CSE111.Assignment_06;

public class Passenger {
    public static int no_of_passenger = 0;
    public static double total_fare = 0.00;

    private String name;
    private double baggageWeight;
    private double distance;

    public Passenger(String name, double distance) {
        this.name = name;
        this.distance = distance;
        no_of_passenger++;
        total_fare += getFare();
    }

    private double getFare() {
        return 20*distance + 10*baggageWeight;
    }

    public void storeBaggageWeight(double baggageWeight) {
        total_fare -= getFare();
        this.baggageWeight = baggageWeight;
        total_fare += getFare();
    }

    public void passengerDetails() {
        System.out.printf("Name: %s\nFare: %.1f TK\n", name, getFare());
    }
}
