import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    private static int counter;

    @BeforeAll
    static void setUpTest() {
        logger.info("\t The start of test run \n");
    }

    @AfterEach
    void tearDownTest() {
        counter++;
        logger.info("\tThe Test" + counter + " is passed \n");
    }

    @AfterAll
    static void tearDownTest2() {
        logger.info("\tThe end of test run \n");
    }

    @DisplayName("Square of triangle")
    @ParameterizedTest
    @CsvSource({
            "5, 4, 4",
            "5, 3, 1",
            "5, 2, 7",
    })
    void squareTest(double a, double b, double c) {
        double square = Triangle.triangleSquare(a, b, c);
        double per = (a + b + c) / 2;
        Assertions.assertEquals((Math.sqrt(per * (per - a) * (per - b) * (per - c))), square);
    }
}
