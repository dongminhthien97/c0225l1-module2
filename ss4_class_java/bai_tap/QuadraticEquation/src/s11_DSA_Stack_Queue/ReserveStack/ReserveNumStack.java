package s11_DSA_Stack_Queue.ReserveStack;

import java.util.Stack;

public class ReserveNumStack {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            stack.push(num);
        }

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = stack.pop();
        }

        for(int num : arr){
            System.out.println(num + " ");
        }
    }

}
