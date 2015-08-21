class pe0005 {
	
	private int limit;
	private int [] limitArray;
	
	public static void main (String args[]) {
		pe0005 sm = new pe0005(args[0]);
		System.out.println("Smallest Multiple : " + sm.lcm());
	}
	
	public pe0005 (String limValue) {
		
		limit = Integer.parseInt(limValue);
		
		limitArray = new int [limit];
		for (int j = 0; j < limit; j++)
			limitArray[j] = j+1;
			
	}
	
	private int lcm () {
		
		int lcmValue = 1;
		
		for (int i = 2; i <= limit; i++) {
			boolean divFlag = false;
			do {
				divFlag = false;
				for (int k = 0; k < limitArray.length; k++) {
					if (limitArray[k] % i == 0) {
						limitArray[k] = limitArray[k]/i;
						divFlag = true;
					}
				}
				if (divFlag)
					lcmValue = lcmValue * i;
			} while (divFlag);
		}
		
		return lcmValue;
		
	}
	
}