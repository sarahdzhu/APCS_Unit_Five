import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class LineTests {

    private static Line line1 = new Line(5, 4, -17);
    private static Line line2 = new Line(-25, 40, 30);
    private static Line line3 = new Line(-10, -8, 20);

    @Test
    @Order(1)
    public void lineTestGetSlope() {
        assertEquals(-1.25, line1.getSlope());
        assertEquals(0.625, line2.getSlope());
        assertEquals(-1.25, line3.getSlope());
    }

    @Test
    @Order(2)
    public void lineTestIsOnLine() {
        assertTrue(line1.isOnLine(5, -2));
        assertFalse(line2.isOnLine(5, -2));
        assertFalse(line3.isOnLine(5, -2));
    }

    @Test
    @Order(3)
    public void lineTestIsParallel() {
        assertFalse(line1.isParallel(line2));
        assertTrue(line1.isParallel(line3));

    }


}
