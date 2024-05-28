import com.nkolosnjaji.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SimpleTest {

    @Test
    void test() {
        Assertions.assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
