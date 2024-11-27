import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RandomsTest {

    @Test
    public void testInfiniteIterator() {
        Randoms randoms = new Randoms(1, 10);
        Iterator<Integer> iterator = randoms.iterator();

        // Проверяем, что итератор может генерировать числа
        for (int i = 0; i < 10; i++) {
            assertTrue(iterator.hasNext(), "Итератор должен всегда возвращать true для hasNext()");
            int randomNum = iterator.next();
            assertTrue(randomNum >= 1 && randomNum <= 10,
                    "Сгенерированное число " + randomNum + " вне диапазона [1, 10]"); //Ожидаем положительный результат
        }
    }
}