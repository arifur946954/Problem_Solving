public class practise {
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Print the current division
            System.out.print("Dividing array: ");
            for (int i = l; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Sort first half
            sort(arr, l, m);

            // Sort second half
            sort(arr, m + 1, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7, -100, 10, 1, 200, -500};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Start dividing the array
        sort(arr, 0, arr.length - 1);
    }
}
