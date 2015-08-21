public class pe0006 {
	
	public static void main (String args[]) {
	
		if (args[0] == null) {
			System.out.println("Input number missing!");
		}
		else {
			int num = Integer.parseInt(args[0]);
			pe0006 diff = new pe0006();
			System.out.println("Difference : " + diff.difference(num));
		}
	
	}
	
	private int difference (int num) {

		int [] numArray = new int [num];
		
		for (int i = 0; i < numArray.length; i++)
			numArray[i] = i + 1;
			
		// (a + b)^2 - (a^2 + b^2) = 2 (a*b)
		// Therefore find all possible combinations of 2 between the values in the array
		
		int sum = 0;
		int pointer = 0;
		
		while (pointer < numArray.length) {
			for (int j = pointer + 1; j < numArray.length; j++) {
				sum = sum + numArray[pointer] * numArray[j];
			}
			pointer++;
		}
		
		return 2 * sum; 
	}
}