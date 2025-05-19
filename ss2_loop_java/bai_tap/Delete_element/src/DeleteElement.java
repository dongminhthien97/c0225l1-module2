public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 9;
        System.out.println("Mang truoc khi xoa ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int X = 3;
        n = delete(arr, n ,X);

        System.out.println("\n" + "Mang sau khi xoa ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int delete(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1) {
            System.out.println("Khong tim thay phan tu can xoa");
        }
        // Xoa phan tu
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}

