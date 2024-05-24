package homeWork;

public class HwGet {
    public static void main(String[] args) {
        Pairs<String, Integer> pair1 = new Pairs<>("apple", 5);
        Pairs<String, Integer> pair2 = new Pairs<>("apple", 5);

        System.out.println(pair1.equals(pair2)); // Output: true

        System.out.println(pair1.getFirst()); // Output: apple
        System.out.println(pair1.getSecond()); // Output: 5

        System.out.println(pair1.hashCode()); // Output the hash code of pair1
    }
}
