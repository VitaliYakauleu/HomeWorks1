package homeWork;

//Дан массив целых чисел, в котором каждый элемент равен его индексу, например [0,1,2].
//Вывести все перестановки его n элементов, в которых элементы a и b не соседствуют.

import java.util.ArrayList;

public class HomeWorkT1_1302 {

    public static void main(String[] args) {
        int n = 4;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generatePermutations(nums, 0, result);

        for (ArrayList<Integer> perm : result) {
            if (isValid(perm)) {
                System.out.println(perm);
            }
        }
    }

    public static void generatePermutations(int[] nums, int index, ArrayList<ArrayList<Integer>> result) {
        if (index == nums.length) {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = index; i < nums.length; i++) {
                swap(nums, index, i);
                generatePermutations(nums, index + 1, result);
                swap(nums, index, i);
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static boolean isValid(ArrayList<Integer> perm) {
        for (int i = 0; i < perm.size() - 1; i++) {
            if (Math.abs(perm.get(i) - perm.get(i+1)) == 1) {
                return false;
            }
        }
        return true;
    }
}