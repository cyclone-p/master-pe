class pe0001 {
	
	// Sum of multiples of 3 and 5
	
	public static void main (String args[]) {
		int sum = 0;
		if (args[0] != null) {
			int uptoNum = Integer.parseInt(args[0]);
			
			for (int i = 1; i < uptoNum; i++) {
				if ((i%3 == 0) || (i%5 == 0))
					sum = sum + i;
			}
		}
		System.out.println("Sum: " + sum);
	}
	
}