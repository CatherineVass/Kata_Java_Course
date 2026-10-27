import java.math.BigInteger;

public class factorial {
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
