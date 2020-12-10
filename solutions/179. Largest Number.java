class Solution {
    public String largestNumber(int[] nums) {
        
        List<String> list = new ArrayList<>();
        
        for(int num:nums){
            
            list.add(Integer.toString(num));
        }
        
        list.sort((a, b) -> (a + b).compareTo(b + a));
        
        
        StringBuilder sb = new StringBuilder();
        
        System.out.println(list);
        
        for(int i = list.size()-1; i >= 0; i--)
        {
            
            if(i == list.size() - 1 && list.get(i).equals("0"))
            {
                sb.append("0");
                break;
            }
            sb.append(list.get(i));
        }
        
        
        return sb.toString();
    }
}
