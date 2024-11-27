import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Минимальное значение должно быть меньше максимального.");
        }
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true; // Бесконечный итератор
        }

        @Override
        public Integer next() {
            return random.nextInt((max - min) + 1) + min; // Генерация случайного числа в диапазоне
        }
    }
}
