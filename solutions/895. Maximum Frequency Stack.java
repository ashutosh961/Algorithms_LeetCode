class FreqStack {
    
    int index;
    Map<Integer, Integer> map;
    PriorityQueue<int[]> pq;
    
    public FreqStack()
    {    
        index = 0;
        map = new HashMap<>();
        pq = new PriorityQueue<>((a,b) ->(b[0] != a[0] ? b[0] - a[0] : b[1] - a[1]));
    }
    
    public void push(int x) {
        
        if(!map.containsKey(x))
        {
            map.put(x, 1);
        }
        else
        {
            map.put(x, map.get(x)+1);
        }
        
         pq.add(new int[]{map.get(x), index, x});
         index ++;
        
    }
    
    public int pop() {
        
        int[] x = pq.poll();
        int val = x[2];
        map.put(val, map.get(val)-1);
        
       
        return val;
    }
}
​
/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
