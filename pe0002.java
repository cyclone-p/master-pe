import java.util.HashMap;

class pe0002 {

	HashMap<Integer, Integer> fibTermHM = new HashMap<> ();

	public static void main (String args[]) {
		pe0002 fse = new pe0002();
		System.out.println("Sum 0: " + fse.fibSum(Integer.parseInt(args[0])));
		System.out.println("Sum 1: " + fse.fibSumI(Integer.parseInt(args[0])));
	}

	public int fibTerm (int n) {

		int f0 = 0;
		int f1 = 1;

		if (n == 0)
			return f0;
		if (n == 1)
			return f1;

		int fn = 0;
		
		if (fibTermHM.containsKey(n))
			return fibTermHM.get(n);
		else {
			fn = fibTerm(n-1) + fibTerm(n-2);
			fibTermHM.put(n, fn);
		}
		return fn;

	}

	public int fibSum (int maxTerm) {
		
		int sum = 0;
		int t = 0;
		int ft = fibTerm(t);

		while (ft <= maxTerm) {
			if(ft%2 == 0)
				sum = sum + ft;
			ft = fibTerm(++t);					
		}

		return sum;
	}

	public int fibSumI(int maxTerm) {
		int sum = 0;
		int a = 1;
		int b = 1;
		int c = a + b;
		while (c <= maxTerm) {
			sum = sum + c;
			a = b + c;
			b = c + a;
			c = a + b;
		}
		return sum;
	}
	
}