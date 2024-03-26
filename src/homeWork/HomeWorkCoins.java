package homeWork;

 //В кошельке есть набор монет. Вывести перебором все возможные подмножества монет для оплаты заданной суммы.
import java.util.ArrayList;
import java.util.List;

public class HomeWorkCoins {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; // Доступные монеты
        int targetSum = 7; // Целевая сумма для оплаты

        List<List<Integer>> result = new ArrayList<>();
        findChange(coins, targetSum, 0, new ArrayList<>(), result);

        // Выводим найденные комбинации монет для оплаты заданной суммы
        for (List<Integer> change : result) {
            System.out.println(change);
        }
    }

    private static void findChange(int[] coins, int targetSum, int start, List<Integer> current, List<List<Integer>> result) {
        if (targetSum == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < coins.length; i++) {
            if (coins[i] <= targetSum) {
                current.add(coins[i]);
                findChange(coins, targetSum - coins[i], i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}

