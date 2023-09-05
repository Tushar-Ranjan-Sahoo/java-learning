import java.math.BigInteger;

public class Main {
	public static BigInteger findGCD(int A, String B) {
		// Convert string B to a BigInteger
		BigInteger bigB = new BigInteger(B);
		// Convert int A to a BigInteger
		BigInteger bigA = BigInteger.valueOf(A);
		// Find the greatest common divisor of A and B using the gcd method from the BigInteger class
		BigInteger result = bigA.gcd(bigB);
		return result;
	}

	public static void main(String[] args) {
		// Example
		int A = 10;
		String B = "128769586950601";
		System.out.println(findGCD(A, B)); // Output: 10
	}
}
