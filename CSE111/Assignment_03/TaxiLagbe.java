// Task 06

package CSE111.Assignment_03;

public class TaxiLagbe {
    private String taxi_id;
    private String taxi_location;
    private int passenger_capacity = 4;
    private String[] passenger_name = new String[passenger_capacity];
    private int current_passenger_count = 0;
    private int total_fare = 0;
    
    public void storeInfo(String taxi_id, String taxi_location){
        this.taxi_id = taxi_id;
        this.taxi_location = taxi_location;
    }

    public void printDetails(){
        System.out.println("Taxi number: "+ taxi_id);
        System.out.println("This taxi can cover "+ taxi_location + " area");
        System.out.println("Total Passenger: "+ current_passenger_count);
        System.out.println("Passenger Lists: ");
        for(int i = 0; i < current_passenger_count; i++){
            System.out.print(passenger_name[i] + " ");
        }
        System.out.println("Total collected Fare: "+ total_fare + " Taka");
    }

    public void addPassenger(String name, int fare){
        if (current_passenger_count+1 > passenger_capacity) {
            System.out.println("Taxi Full! No more passengers can be added");
            return;
        }
        passenger_name[current_passenger_count] = name;
        current_passenger_count++;
        total_fare += fare;
        System.out.printf("Dear %s! Welcome to TaxiLagbe", name);
        System.out.println();
    }

    public void addPassenger(String name1, int fare1, String name2, int fare2){
        if (current_passenger_count+2 > passenger_capacity) {
            System.out.println("Taxi Full! No more passengers can be added");
            return;
        }
        this.addPassenger(name1, fare1);
        this.addPassenger(name2, fare2);
    }
    
}
