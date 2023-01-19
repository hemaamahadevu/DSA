public class MaxWaterLevel {
	
	public static void main(String[] args) {
		
		maxArea(new int[] {1, 5, 4, 3});
		
	}
	
	 public static int maxArea(int[] A) {
	        int N = A.length;
	        if(N==1){
	            return 0;
	        }
	        if(N==2){
	            return Math.min(A[0],A[1]);
	        }
	        int i=0;int j=1;
	        long max = Integer.MIN_VALUE;
	        while(i<j){
	            int val = (j-i)*Math.min(A[i],A[j]);
	            if( max<val ) {
	                max = val;
	            }
	            if(A[j]<=A[i]){
	                j--;
	            }else{
	                i++;
	            }
	        }
	        return (int)max;
	    }
}
