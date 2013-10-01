package projecteuler.p0003;

import projecteuler.PEFunctions;

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

		ArrayList<Long> factors = PEFunctions.getFactors(Long.parseLong(args[0]));
		Collections.sort(factors, Collections.reverseOrder());
		if (factors != null) {
			for (Long factor : factors) {
				System.out.print(factor + ": ");
				if (PEFunctions.isPrime(factor)) {
					System.out.println("prime");
				} else {
					System.out.println("not prime");
				}
			}
		}
	}
}

