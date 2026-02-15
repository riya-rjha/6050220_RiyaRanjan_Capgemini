public class Insertion1 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 7, 6 };

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // Move elements greater than curr
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        // Output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
