public class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty()) return 0;
        char[] chars = s.toCharArray();
        int j=0, i;
        char sign = '+';
        for (i = 0; i < chars.length; i++) {
            if((chars[i] == '0' || chars[i] == ' ') && i == j) {
                ++j;
                continue;
            }
            if((chars[i] == '-' || chars[i] == '+') && j == i) {
                ++j;
                sign = chars[i];
                continue;
            }
            if(!(chars[i] >= '0' && chars[i] <= '9')) break;
        }
        s = s.substring(j,i);
        if(s.isEmpty()) return 0;
        s = sign+s;
        try{
            i = Integer.parseInt(s);
        }catch(NumberFormatException e){
            if(sign == '-') return -2147483648;
            return -2147483648;
        }
        return i;
    }
}
