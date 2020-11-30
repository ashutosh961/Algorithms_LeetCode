class Solution {
    public String customSortString(String S, String T) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<S.length();i++)
        {
            map.put(S.charAt(i),  i);
        }
        
        
        List<Character> list = new ArrayList<>();
        for(int i=0;i<T.length();i++)
        {
            list.add(T.charAt(i));                     
        }
            
        
        Collections.sort(list, (a,b) -> (map.getOrDefault(a, Integer.MAX_VALUE) - map.getOrDefault(b, Integer.MAX_VALUE)));
                         
                   
                  
       
        String s = "";
        for(int i=0;i<list.size();i++)
        {
            s += list.get(i);
        }
        
        return s;
    }
}
