package arrays;

import java.util.Arrays;

//б) двадцатью первыми членами геометрической прогрессии с известным
//первым членом прогрессии а и ее знаменателем z;
public class Task11_9b {
    public static void main(String[] args) {


        int z = 3;
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*z;

        }
        System.out.println(Arrays.toString(arr));
    }
}
