import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict); 
        int n = s.length();
        boolean[] dp = new boolean[n + 1]; 
        
        dp[0] = true; 
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) { 
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n]; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        List<String> wordDict1 = Arrays.asList("leet", "code");
        System.out.println(sol.wordBreak("leetcode", wordDict1)); 

        List<String> wordDict2 = Arrays.asList("apple", "pen");
        System.out.println(sol.wordBreak("applepenapple", wordDict2)); 

        List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(sol.wordBreak("catsandog", wordDict3)); 
    }
}
