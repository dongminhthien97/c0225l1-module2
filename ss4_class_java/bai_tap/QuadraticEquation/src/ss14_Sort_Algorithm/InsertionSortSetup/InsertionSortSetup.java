package ss14_Sort_Algorithm.InsertionSortSetup;

public class InsertionSortSetup {
    public static void InsertionSortSetup(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && key < list[j]) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}
