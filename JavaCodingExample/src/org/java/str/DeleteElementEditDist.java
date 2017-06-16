package org.java.str;
/*
 * Given two words word1 and word2, find the minimum number of 
 * steps required to make word1 and word2 the same, where in 
 * each step you can delete one character in either string.
 */
public class DeleteElementEditDist {
	public int minDistance(String word1, String word2) {
	      
	      return dynamicEditDistance(word1,word2,word1.length(),word2.length());
	      
	        
	    }
	    public  int dynamicEditDistance(String word1, String word2, int m, int n ){
	    	int dp[][]=new int[m+1][n+1];
	    	for(int i=0;i<=m;i++){
	    		for(int j=0 ;j<=n;j++){
	    			if(i==0)
	    				dp[i][j]=j;
	    			else if(j==0)
	    				dp[i][j]=i;
	    			else if (word1.charAt(i-1)==word2.charAt(j-1))
	    				dp[i][j]=dp[i-1][j-1];
	    			else
	    				dp[i][j]= 1+ Math.min(dp[i][j-1],dp[i-1][j]);
	    				
	    			}
	    		}
	    	
			return dp[m][n];
	    
	    }
	     int min(int a,int b, int c){
	        int l=Math.min(a,b);
	        return Math.min(l,c);
	    }
}
