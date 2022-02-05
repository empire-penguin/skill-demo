import static org.junit.Assert.*;
import org.junit.*;

public class SkillsTester {
    @Test 
    public void testMultiply(){
        assertEquals(9.0, MadSkills.multiply(4, 2),0.01);
    }
}
