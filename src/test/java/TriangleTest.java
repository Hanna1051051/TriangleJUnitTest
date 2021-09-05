
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {

    @DisplayName("Square of triangle")
    @ParameterizedTest
    @CsvSource({
            "5, 4, 4"
    })

    void squareTest(double a, double b, double c){
        double square = Triangle.triangleSquare(a, b, c);
        double per = (a + b + c)/2;
        Assertions.assertEquals((Math.sqrt(per*(per-a)*(per-b)*(per-c))), square);
    }
}
