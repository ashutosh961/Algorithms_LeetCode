class Solution {
    
    
    public int set_roman_to_char(char c){
        
        if(c=='X'){return 10;}
        if(c=='M'){return 1000;}
        if(c=='D'){return 500;}
        if(c=='I'){return 1;}
        if(c=='L'){return 50;}
        if(c=='C'){return 100;}
        if(c=='V'){return 5;}
       return 1; 
    }
    
    
    public int romanToInt(String s) {
        
        int s1=0;
        int s2=0;
        int res = 0;
        
        for(int i=0;i<s.length();i++){
            
            s1 = set_roman_to_char(s.charAt(i));
            
            if(i+1<s.length()){
                
                s2 = set_roman_to_char(s.charAt(i+1));
                
                if(s1>=s2){res = res+s1;}
                else{
                    
                    res = res + s2 - s1;
                    i++;
                }
                
            }
