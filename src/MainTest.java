import org.junit.Test;
import static org.junit.Assert.assertEquals;
import eight.sol6.HelloWorld;

public class MainTest {
    @Test
    public void testBasic() {
        assertEquals("hello world!", HelloWorld.greet());
    }
}
