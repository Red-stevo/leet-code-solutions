public class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty()) return 0;
        int j=0, i;
        boolean checkZero = true;
        for (i = 0; i < s.length(); i++) {
            if((s.charAt(i) == '0' || s.charAt(i) == ' ') && i == j) {
                if(s.charAt(i) == '0') checkZero = false;
                if(s.charAt(i) == ' ' && !checkZero) break;
                ++j;
                continue;
            }
            if((s.charAt(i) == '-' || s.charAt(i) == '+') && j == i && checkZero) continue;

            if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) break;
        }
        if(i == j ) return 0;
        if(((s.charAt(j) == '-' && (i-1) == j) || (s.charAt(j) == '+') && (i-1)==j)) return 0;
        try{
            i = Integer.parseInt(s.substring(j,i));
        }catch(NumberFormatException e){
            if(s.charAt(j) == '-') return -2147483648;
            return 2147483647;
        }
        return i;
    }
}
