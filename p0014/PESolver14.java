package projecteuler.p0014;

import projecteuler.PEFunctions;

public class PESolver14
{
	public static void main(String[] args)
	{
		long number = 0;
		long longest = 0;
		for (long x = 1L; x < 1000000; x++) {
			long chain = processChain(x);
			if (chain > longest) {
				number = x;
				longest = chain;
				System.out.println("new longest: " + number + ": " + longest);
			}
		}
		System.out.println("longest: " + number + ": " + longest);
	}

	public static long processChain(long start)
	{
		long chain = 1;
		long current = start;
		while (current > 1) {
			current = processNumber(current);
			chain++;
		}
		return chain;
	}

	public static long processNumber(long number)
	{
		if (number % 2 == 0) {
			return (number / 2);
		} else {
			return ((number * 3) + 1);
		}
	}
}

