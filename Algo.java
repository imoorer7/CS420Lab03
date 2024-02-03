package Lab03;


public class Algo {
	
	public static int CycleLength(int c) {
		int count = 1;
		while(c != 1) {
			if (c%2==0) {
				c = c / 2;
			}
			else {
				c = c * 3 + 1;
			}
			count += 1;
		}
		return count;
		
	}
	
	public static int MaxCycle(int i, int j) {
		int MaxLength = 0;
		for (int k = i; k < j; k++) {
			int Length = CycleLength(k);
			if (MaxLength < Length) {
				MaxLength = Length;
			}
		}
		return MaxLength;
	}
	 

	public static void main(String[] args) {
		int i = -1;
		int j = 10;
		MaxCycle(i, j);
		System.out.print(i + " ");
		System.out.print(j + " ");
		System.out.print(MaxCycle(i, j));
		
	}

}
