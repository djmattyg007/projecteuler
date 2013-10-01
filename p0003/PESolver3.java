import java.util.ArrayList;
import java.util.Collections;

public class PESolver3
{
	public static void main(String[] args)
	{
		if (args.length < 1) {
			System.out.println("Not enough arguments.");
			System.exit(1);
		}

		ArrayList<Long> factors = PESolver3.getFactors(Long.parseLong(args[0]));
		Collections.sort(factors, Collections.reverseOrder());
		if (factors != null) {
			for (Long factor : factors) {
				System.out.print(factor + ": ");
				if (PESolver3.isPrime(factor)) {
					System.out.println("prime");
				} else {
					System.out.println("not prime");
				}
			}
		}
	}

	public static ArrayList<Long> getFactors(long num)
	{
		if (num < 1) {
			return null;
		} else if (num == 1) {
			ArrayList<Long> factors = new ArrayList<Long>();
			factors.add(1L);
			return factors;
		}

		ArrayList<Long> factors = new ArrayList<Long>();
		Double tmpRoot = new Double(Math.ceil(Math.sqrt(num)));
		long root = tmpRoot.longValue();
		for (long x = 1L; x <= root; x++) {
			if (num % x == 0) {
				if (!factors.contains(x)) {
					factors.add(x);
				}
				Long x2 = (long) (num / x);
				if (!factors.contains(x2)) {
					factors.add(x2);
				}
			}
		}

		return factors;
	}

	public static boolean isPrime(long num)
	{
		if (num <= 1) {
			return false;
		} else if (num == 2) {
			return true;
		}
		Double tmpRoot = new Double(Math.ceil(Math.sqrt(num)));
		long root = tmpRoot.longValue();
		for (long x = 2; x <= root; x++) {
			if (num % x == 0) {
				return false;
			}
		}
		return true;
	}
}

