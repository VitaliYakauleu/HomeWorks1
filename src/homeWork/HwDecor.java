package homeWork;
//Разработать приложение, генерирующее несколько последовательностей чисел
// (по заранее заданному алгоритму, например, последовательность чисел Фибоначчи, последовательность простых чисел,
// последовательность факториалов целых неотрицательных чисел). Генерирование типа последовательности
// и количество генерируемых элементов должно определяться пользователем. Для каждой последовательности после генерации
// указать время работы соответствующего алгоритма. Определение этого времени реализовать, используя шаблон проектирования «Decorator».
import java.util.ArrayList;
import java.util.List;

interface Sequence {
    List<Integer> generateSequence(int n);
}

class FibonacciSequence implements Sequence {
    @Override
    public List<Integer> generateSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        if (n > 1) {
            sequence.add(1);
            for (int i = 2; i < n; i++) {
                sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
            }
        }
        return sequence;
    }
}

class PrimesSequence implements Sequence {
    @Override
    public List<Integer> generateSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        int num = 2;
        while (sequence.size() < n) {
            if (isPrime(num)) {
                sequence.add(num);
            }
            num++;
        }
        return sequence;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
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

class FactorialsSequence implements Sequence {
    @Override
    public List<Integer> generateSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequence.add(factorial(i));
        }
        return sequence;
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class TimingDecorator implements Sequence {
    private Sequence sequence;

    public TimingDecorator(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public List<Integer> generateSequence(int n) {
        long startTime = System.nanoTime();
        List<Integer> result = sequence.generateSequence(n);
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        return result;
    }
}

public class HwDecor {
    public static void main(String[] args) {
        Sequence fibonacci = new TimingDecorator(new FibonacciSequence());
        System.out.println("Fibonacci sequence:");
        System.out.println(fibonacci.generateSequence(10));

        Sequence primes = new TimingDecorator(new PrimesSequence());
        System.out.println("Primes sequence:");
        System.out.println(primes.generateSequence(10));

        Sequence factorials = new TimingDecorator(new FactorialsSequence());
        System.out.println("Factorials sequence:");
        System.out.println(factorials.generateSequence(10));
    }
}