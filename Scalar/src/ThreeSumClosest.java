public class ThreeSumClosest {
    public int threeSumClosest(int[] A, int B) {
      Arrays.sort(A);
      int N = A.length;
      long finalans = Integer.MAX_VALUE;
      for(int i=0;i<N;i++){
          int j = i+1;
          int k = N-1;
          while(j<k){
            long sum = A[i]+A[j]+A[k];
            if(Math.abs(B-sum) < Math.abs(B-finalans)){
                finalans = sum;
            }
            if(sum>B){
                k--;
            }else{
                j++;
            }
        }
      }
      return (int)finalans;
    }
}
