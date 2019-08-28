public class Practice01MathRecursive implements Practice01Math
{

	public int fib (int n) throws Exception {
		if (n == 0 || n == 1) {
			return n;
		}
		else if (n > 1) {
			return fib(n - 1) + fib(n - 2);
		}
		else {
			return 0;
		}
	}

	public int fact (int n) throws Exception {
		if (n == 1) {
			return n;
		}
		else if (n > 1) {
			return fact(n - 1) * n;
		}
		else {
			throw new IllegalArgumentException();
		}

	}


}