import org.junit.Test;
import static org.junit.Assert.assertEquals;
import two.Kata;

public class MainTest {
    @Test
    public void testBasic() {
        assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
    }
}
