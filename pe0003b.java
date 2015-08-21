import java.time.LocalDateTime;

class pe0003b {
	
	public static void main (String args[]) {
		
		LocalDateTime start = LocalDateTime.now();
		
		pe0003b maxPrimeFactor = new pe0003b();

		long n = 600851475143L;
		long mpfac = maxPrimeFactor.findMaxPF(n);
		
		System.out.println ("Max. Prime Factor : " + mpfac);
				
		LocalDateTime end = LocalDateTime.now();

		System.out.println("\nRun Time : " + maxPrimeFactor.getTimeDiff(start, end));
	
	}

	private long findMaxPF(long num) {
		
		long n = num;
		
		double nsqroot = Math.sqrt((double)n);
		int nsq = (new Double(nsqroot)).intValue();
			
		long divisor = 2L;
			
		while (divisor <= nsq) {

			long remainder = n % divisor;
		
			if (remainder == 0) {
				n = n/divisor;
				return findMaxPF(n);
			}
			
			divisor++;
		}

		return n;

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