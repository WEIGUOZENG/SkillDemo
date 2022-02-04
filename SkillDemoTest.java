import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testDouble(){
        int value = SkillDemo.doubling(2);
        assertEquals(4, value);
    }
}
