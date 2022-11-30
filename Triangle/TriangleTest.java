
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {
    private Triangle triangle;

    // Positive scenarios
    @Test
    public void WHEN_valid_height_provided_THEN_print_triangle() throws Exception {
        triangle= new Triangle(5);
        //triangle.printTriangleByHeight();
        String expectedOut = "     * \n" +
                "    * * \n" +
                "   * * * \n" +
                "  * * * * \n" +
                " * * * * * \n";

        Assertions.assertEquals(triangle.stringOutputTriangleByHeight(), expectedOut);



    }

    // Negative scenarios - shouldn't print
    @Test
    public void WHEN_invalid_height_provided_THEN_prints_message() {
        triangle= new Triangle(-5);
        triangle.printTriangleByHeight();
        String expectedOut = "     * \n" +
                "    * * \n" +
                "   * * * \n" +
                "  * * * * \n" +
                " * * * * * \n";

        Assertions.assertNotEquals(triangle.stringOutputTriangleByHeight(), expectedOut);

    }
}
