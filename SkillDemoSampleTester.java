import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
//copied code for basic formatting for JUnit tests from week 4

public class SkillDemoSampleTester {
    int[] intArray = {0,1,2,3};
    @Test
    public void arrayAverage() {
        assertEquals(6, SkillDemoSample.averageArray(intArray));
    }
}