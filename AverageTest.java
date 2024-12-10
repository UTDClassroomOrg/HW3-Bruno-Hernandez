import org.junit.Test;
import static org.junit.Assert.*;

public class AverageTest {
    @Test
    public void basicCase() {
        Average avg = new Average();
        assertEquals(4, avg.average(3, new int[]{2, 4, 6, 8}));
    }

    @Test
    public void exceeds() {
        Average avg = new Average();
        assertEquals(2, avg.average(10, new int[]{1, 2, 3}));
    }

    @Test
    public void empty() {
        Average avg = new Average();
        assertEquals(0, avg.average(5, new int[]{}));
    }

    @Test
    public void single() {
        Average avg = new Average();
        assertEquals(42, avg.average(1, new int[]{42}));
    }

    @Test
    public void zero() {
        Average avg = new Average();
        assertEquals(0, avg.average(0, new int[]{1, 2, 3}));
    }
}
