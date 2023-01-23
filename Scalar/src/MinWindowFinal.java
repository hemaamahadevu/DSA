public class MinWindowFinal {

public static String minWindowFinal(String A,String B) {
		Map<Character,Integer> mapB = new HashMap<>();
		char[] charB = B.toCharArray();
		for(int i=0;i<charB.length;i++) {
			int val = mapB.getOrDefault(charB[i], 0);
			mapB.put(charB[i], val+1);
		}
		int left =0;
		int right =0;
		char[] charA = A.toCharArray();
		int N = charA.length;
		int count = mapB.size();
		int ansCount =0; 
		int finalAns = Integer.MAX_VALUE;
		String result = "";
		Map<Character,Integer> mapA = new HashMap<>();
		while(right<N) {
			char c = charA[right];
			int val = mapA.getOrDefault(c, 0);
			mapA.put(c, val+1);
			if(mapB.containsKey(c) && mapA.get(c) == mapB.get(c) ) {
				ansCount++;
			}
			while(left<=right && ansCount == count) {
				int temp = right-left+1;
		
				char d = charA[left];
				if(finalAns>temp) {
					finalAns = temp;
					result = A.substring(left,right+1);
				}
				mapA.put(d, mapA.get(d)-1);
				if(mapB.containsKey(d) && mapA.get(d)<mapB.get(d)) {
					ansCount--;
				}
				left++;
			}
			right++;
		}
		if(finalAns==Integer.MAX_VALUE) {
			return A;
		}
		return result;
	}
}
