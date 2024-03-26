package Laba;
//дана последовательность чисел а1, а2, а3 ... аn.
// выяснить является ли она возрастающей последовательностью простых чисел
public class Lab4_1 {
    public static void main(String[] args) {
        //создаем массив с 10 числами вручную(изначально будет подходить под условие)
        int[] nums = new int[] { 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
        //Для того чтобы выяснить, является ли последовательность чисел возрастающей последовательностью простых чисел,
        // нужно сначала проверить каждое число на простоту, 
        // а затем проверить, что они идут в порядке возрастания.
        for (int i = 0; i < nums.length; i++) {
            // метод isPrime проверит все числа в массивк на простоту.
            if (isPrime(nums[i])) {
                System.out.println(nums[i] + " число простое");

            } else {
                System.out.println(nums[i] + " число составное ");
            }

    }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            }
        }

        if (count == nums.length - 1) {
            System.out.println("Числа в массиве идут по возрастанию");
        } else {
            System.out.println("Числа в массиве НЕ идут по возрастанию");
        }




        //for (int i = 1; i < nums.length; i++) {
         //  if (i<i++) {
           //    System.out.println("идут по возрастанию");
      //     }

    //   }


}
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }




}