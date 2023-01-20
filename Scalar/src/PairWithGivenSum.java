public class Solution {
    int mod = 1000000007;
    public  int solve(int[] A, int B) {
       int i=0;
       int  N = A.length;
       int j=N-1;
       long sum =0;
       long ans =0;
       while(i<j){
           sum = A[i]+A[j];
           if(sum < B){
               i++;
           }else if (sum > B){
               j--;
           }else if(A[i]==A[j]){
               long count = j-i+1;
               ans = (ans%mod + (count *(count-1)/2)%mod%mod);
               break;
           }else if(A[i]!=A[j]){
               int x = A[i];
               int y = A[j];
               int ci=0;
               int cj=0;
               while(i<A.length && A[i]==x){
                   i++;
                   ci++;
               }
               while(A[j]==y){
                   j--;
                   cj++;
               }
               ans = ((ans%mod) + (ci*cj)%mod)%mod;
           }
       }
       return (int)(ans%mod);
    }
}
