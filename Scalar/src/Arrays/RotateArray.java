package Arrays;

public class RotateArray {
	public static void main(String[] args) {
		rotateArrayByK(new int[] {1,2,3,4,5},3);
	}
	
	public static void rotateArrayByK(int[] A,int k) {
		int N = A.length;
		k=k%N;
		reverseArray(A,0,N-1);
		reverseArray(A,0,k-1);
		reverseArray(A,k,N-1);
		
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void reverseArray(int[] A,int i,int j) {
		while(i<j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;
		}
		
	}

}
