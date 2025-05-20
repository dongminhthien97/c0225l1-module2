public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 20, 3, 7};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min value: " + min);
    }
}
