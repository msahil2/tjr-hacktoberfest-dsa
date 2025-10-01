class Solution {
    public int help(char a){
        if(a=='M')return 1000;
        else if(a=='D')return 500;
        else if(a=='C')return 100;
        else if(a=='L')return 50;
        else if(a=='X')return 10;
        else if(a=='V')return 5;
        else return 1;
    }
    public int romanToInt(String s) {
        int sum=help(s.charAt(s.length()-1));
        for(int i=s.length()-1;i>0;i--){
            char ch=s.charAt(i);
            char ch1=s.charAt(i-1);
            if(help(ch1)<help(ch))sum-=help(ch1);
            else sum+=help(ch1);
        }
        return sum;
        
    }
}
