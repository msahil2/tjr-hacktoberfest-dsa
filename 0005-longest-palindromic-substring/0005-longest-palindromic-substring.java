class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1)return s;
        int[][] dp=new int[n][n];
        int c=0;int c1=0;
        for(int k=0;k<n;k++){
            int i=0,j=k;
            while(j<n){
                if(i==j){
                    dp[i][j]=1;
                    c=i;
                    c1=j;
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;
                        c=i;
                        c1=j;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        if(dp[i+1][j-1]==1){
                            dp[i][j]=1;
                            c=i;
                            c1=j;
                        }
                    }
                }
                i++; j++;
            }
        }
          String ans="";
            for(int a=c;a<c1+1;a++){
                ans=ans+s.charAt(a);}
            return ans;
        
        
    }
}
