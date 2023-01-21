public class FindSamePairWithMinimumDistance {
    public int findSamePairWithMinimumDistance(int[] A) {
        int N = A.length;
		    int minLength = Integer.MAX_VALUE;
		    Map<Integer,Integer> map = new HashMap<>();
		    for(int i=0;i<N;i++) {
			      if (map.containsKey(A[i])) {
                int len = i-map.get(A[i]);
				        if(len < minLength) {
					          minLength = len;
				        }
			      }
            map.put(A[i], i);
		    }
        if(minLength == Integer.MAX_VALUE){
            minLength = -1;
        }
        return minLength;
    }
}
