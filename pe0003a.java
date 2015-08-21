import java.time.LocalDateTime;
import java.util.BitSet;

class pe0003 {
	
	public static void main (String args[]) {
		
		LocalDateTime start = LocalDateTime.now();
		
		pe0003 maxPrimeFactor = new pe0003();

		long n = 600851475143L;
		BitSet primes = maxPrimeFactor.sieveOfEratosthenes(n);
		
		int i = primes.length() - 1;
		
		while (i >= 0) {
			System.out.println ("\ni : " + i);
			if (primes.get(i) && (n % i == 0))
				break;
			i--;
		}
			
		System.out.println ("Max. Prime Factor : " + i);
				
		LocalDateTime end = LocalDateTime.now();

		System.out.println("\nRun Time : " + maxPrimeFactor.getTimeDiff(start, end));
	
	}

	private BitSet sieveOfEratosthenes(long num) {
		
		BitSet flags = new BitSet ((int)num + 1);
		
		double nsqroot = Math.sqrt((double)num);
		int nsq = (new Double(nsqroot)).intValue();
		System.out.println("Number Square Root : " + nsq);
		
		flags.set(0, (int)num);
		flags.clear(0);
		flags.clear(1);
			
		int prime = 2;
			
		while (prime <= nsq) {
			
			crossOff(flags, prime);
			System.out.print (prime + " ");
			prime = getNextPrime(flags, prime);
			
			if (prime >= flags.length())
				break;
		}
		
		return flags;
		
	}
	
	private void crossOff (BitSet flags, int prime) {
		
		for (int i = prime * prime; i < flags.length(); i += prime) {
			System.out.println (" sq " + i);
			flags.clear(i);
		}
	
	}
	
	private int getNextPrime (BitSet flags, int prime) {
		
		int next = prime + 1;
		
		while (next < flags.length() && !flags.get(next))
			next++;
		
		return next;
	}
	
	private String getTimeDiff (LocalDateTime start, LocalDateTime end) {
			
			int startDay = start.getDayOfMonth();
			int startHour = start.getHour();
			int startMin = start.getMinute();
			
			int endDay = end.getDayOfMonth();
			int endHour = end.getHour();
			int endMin = end.getMinute();
			
			int daydiff = endDay - startDay;
			int hourdiff = endHour - startHour;
			int mindiff = endMin - startMin;
			
			return ("\n" + daydiff + " Days " + "\n" + hourdiff + " Hours "+ "\n" + mindiff + " Minutes ");
					
	}
	
}