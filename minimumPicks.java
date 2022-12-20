package MinimumPicks;

import java.util.*;

class MinimumPicks {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
		int N = sc.nextInt();
        System.out.println("Enter array elemensts:");
		int[] A = new int[N];
		
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
        int maxEven = Integer.MIN_VALUE, minOdd = Integer.MAX_VALUE;

        for (int j=0; j<N; j++) {
            if (A[j] % 2 == 0) {
				if (A[j] > maxEven) {
					maxEven = A[j];
                	// System.out.println(maxEven);	
				}
            }
			if (A[j] % 2 != 0) {
				if (A[j] < minOdd) {
					minOdd = A[j];
                	// System.out.println(minOdd);	
				}				
			}
        }
		System.out.println(maxEven-minOdd);
		sc.close();
	}
}