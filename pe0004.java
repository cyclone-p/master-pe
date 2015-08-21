import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class pe0004 {
	
	private HashMap<Integer, String> palindromes = new HashMap<>();
	
	public static void main (String args[]) {
		
		pe0004 mp = new pe0004();
		mp.findMaxP(999, 999);
		
		int maxPkey = 0;
		int maxP = 0;
		
		Set<Integer> keys = mp.palindromes.keySet();
		Iterator i = keys.iterator();

		while (i.hasNext()) {
			Integer key = (Integer) i.next();
			if (key.intValue() > maxPkey) {
				maxPkey = key;
			}
		}
		
		System.out.println("Max. Palindrome = " + maxPkey + " (" + mp.palindromes.get(maxPkey) + ")");
	
	}
	
	public void findMaxP (int a, int b) {
		
		for (int i = a; i >= 100; i--) {
			for (int j = b; j >= 100; j--) {

				int k = i * j;
				int n = k;
				int krev = 0;
				while (n != 0) {
					krev = (krev * 10) + (n % 10);
					n = n / 10;
				}

				if (k - krev == 0) {
					this.palindromes.put(k, new String(i + " * " + j));
				}
			}
		}
	}
}