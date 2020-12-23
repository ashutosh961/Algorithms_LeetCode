class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        
        
        int i = - 1;
        int j = -1;
        int min = Integer.MAX_VALUE;
        
        boolean same = word1.equals(word2);
        
        for(int k=0; k<words.length; k++)
        {
            if(words[k].equals(word1))
            {
                if(same)
                {
                    i = j; // move window
                    j = k;
                }
                else
                  {
                    i = k;
                  }
            }
            else if(words[k].equals(word2) && word1 != word2)
            {
                j = k;
            }
            
            if(i != -1 && j != -1 && i != j)
            {
                min  =  Math.min(min, Math.abs(j - i));
            }
        }
        if(min == Integer.MAX_VALUE){return -1;}
        return min;
    }
}
