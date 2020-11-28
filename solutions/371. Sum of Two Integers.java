class Solution {
    public int getSum(int a, int b) {
        
        int xor_sum  =0;
        
        while(b != 0)
        {
            xor_sum = a ^ b;
            
            System.out.println("xor_sum"+xor_sum);
            b = a & b;
            System.out.println("b:"+b);
            b = b << 1;
            System.out.println("b:"+b);
            a = xor_sum;
            System.out.println("a:"+a);
        }
        return a;
    }
}
