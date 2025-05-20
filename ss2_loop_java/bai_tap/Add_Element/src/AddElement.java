public class AddElement {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        int n = 5;
        int x = 9;
        int postision = 4;
        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = insertToPos(arr, size, n, x, postision);
        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static int insertToPos(int[] arr, int size, int n, int x, int postision) {

        if (n >= size) {
            return n;
        }

        if (postision < 0 || postision > n) {
            return n;
        }
        for(int i = n; i > postision; i--) {
            arr[i] = arr[i - 1];
        }

        arr[postision] = x;
        return n + 1;
    }
}
