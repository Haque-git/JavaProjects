import java.util.Arrays;
public class Main {
    static double[] normalize(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double[] normalizedData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            normalizedData[i] = data[i] / sum;
        }
        return normalizedData;
    }

    static double[] makePiChart(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double[] piChart = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            piChart[i] = (data[i] / sum) * 360;
        }
        return piChart;
    }

    static double[] differenceArray(double[] data1 , double[] data2) {
        if (data1.length != data2.length) {
            return null;
        } else {
            double[] difference = new double[data1.length];
            for (int i = 0; i < data1.length; i++) {
                difference[i] = (data1[i] - data2[i])*100;
            }
            return difference;
            
        }
    }

    public static void main(String[] args) {
        double[] data1 = {56,74,66,72,66,74};
        double[] data2 = {59,79,69,80,70,78};
        System.out.println(Arrays.toString(normalize(data2)));
        System.out.println(Arrays.toString(makePiChart(data2)));
        System.out.println(Arrays.toString(differenceArray(normalize(data1), normalize(data2))));

    }
}
