
package computemethods.java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Mehraneh Hamedani - 30062786
 * AT2 - Activity 6
 */
public class ComputeMethodsTest {
    @Test
    public void testFToC() {
        ComputeMethodsJava computeMethods = new ComputeMethodsJava();
        double degreesF = 100.0;
        double expectedDegreesC = 37.7778;
        double delta = 0.0001;
        double actualDegresC = computeMethods.fToC(degreesF);
        assertEquals(expectedDegreesC, actualDegresC, delta);
    }
}
