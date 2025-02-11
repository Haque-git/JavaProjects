import java.util.Scanner;

public class Planet {
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2) + Math.pow((z1 - z2),2));
    }

    public static int index_finder(String[] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] planets = {"a", "b", "c", "d"};
        double[] x_crod = {1, 2 , 4 , 8};
        double[] y_crod = {1, 2 , 4 , 8};
        double[] z_crod = {1, 2 , 4 , 8};

        while (true) {
            System.out.print("Enter planet name: ");
            String user_input = sc.nextLine();
            int current_index = index_finder(planets, user_input);
            double min_distance = Double.POSITIVE_INFINITY;
            int min_index = -1;
            if (current_index == -1) {
                System.out.println("Invalid input: ");
                continue;
            }

            for (int i = 0; i < planets.length; i++) {
                if (i == current_index) {
                    continue;
                }

                double current_distance = distance(x_crod[i], y_crod[i], z_crod[i], x_crod[current_index], y_crod[current_index], z_crod[current_index]);
                if (current_distance < min_distance) {
                    min_index = i;
                    min_distance = current_distance;
                }
            }
            String closest_planet = planets[min_index];
            System.out.println("Closest plant is " + closest_planet);
            break;
        }

        sc.close();
    }
}
