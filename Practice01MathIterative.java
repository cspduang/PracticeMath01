public class Practice01MathIterative implements Practice01Math
{

	public int fib (int n) throws Exception {
		int num= 1;
		int num2 = 1;
		if (n <= 1) {
			return n;
		}
		for (int i=2; i<n; ++i) {
			int temp = num;
			num += num2;
			num2 = temp;
		}
		return num;
	}

	public int fact (int n) throws Exception {
		int f = 1;
		if (n >= 1) {
			for (int i=1; i<=n; i++) {
				f *= i;
			}
		}
		else {
			throw new IllegalArgumentException();
		}
		return f;
	}

}