public class WaveArray {
    public int[] wave(int[] A) {
        int N = A.length;
        mergeSort(A,0,N-1);
        for(int i=0;i<N-1;i=i+2){
            swap(A,i,i+1);
        }
       return A;
    }

    public void swap(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public void mergeSort(int[] A,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(A,left,mid);
            mergeSort(A,mid+1,right);
            merge(A,left,mid,right);
        }

    }

    public void merge(int[] A, int left,int mid,int right){
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
        int i=0;int j=0;int k=left;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                A[k++] = leftArray[i++];
            }else{
                A[k++] = rightArray[j++];
            }
        }
        while(i<n1){
             A[k++] = leftArray[i++];
        }
        while(j<n2){
            A[k++] = rightArray[j++];
        }
    }
    
}
