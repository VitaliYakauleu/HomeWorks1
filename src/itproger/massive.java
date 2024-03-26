package itproger;
//Создайте массив, после чего найдите наибольший элемент массива
public class massive {
    public static void main(String[] args) {
        int[] nums = new int [] {2, 15, 73, 12, 4, 5, 11,3};
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];

        }
        System.out.println(max);
        }
    }

