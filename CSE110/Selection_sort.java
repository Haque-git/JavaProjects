public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,6,3,8,1,4,2,7};

        for (int i = 0; i < arr.length; i++) { // i = 2
            int max = arr[i]; // max = 3
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
