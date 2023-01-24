public class MergeSort {

	public static void main(String[] args) {
		int[] A = new int[]{12, 11, 13, 5, 6, 7 };
		mergeSort(A,0,A.length-1);
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i] + " ");
		}
		
	}

	private static void mergeSort(int[] A, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(A, left, mid);
			mergeSort(A, mid+1, right);
			merge(A,left,mid,right);
		}
	}


	private static void merge(int[] A, int left, int mid, int right) {
		int n1 = mid-left+1;
		int n2 = right-mid;
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftArray[i] = A[left+i];
		}
		for(int i=0;i<n2;i++) {
			rightArray[i] = A[mid+1+i];
		}
		int i = 0,j=0;
		int k = left;
		while(i<n1 && j<n2) {
			if(leftArray[i]<=rightArray[j]) {
				A[k] = leftArray[i];
				i++;
				k++;
			}else {
				A[k] = rightArray[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			A[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			A[k] = rightArray[j];
			j++;
			k++;
		}
	}

	
}
