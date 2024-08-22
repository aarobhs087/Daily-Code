class Solution {
    public int findComplement(int num) {
        int ans=0;
        StringBuilder sb=new StringBuilder();
        while(num>0){
            if(num%2==0)    sb.append("1");
            else    sb.append("0");
            num/=2;
        }
        sb.reverse();
        for(char c: sb.toString().toCharArray())
            ans=ans*2+(c-'0');
        return ans;
    }
}
