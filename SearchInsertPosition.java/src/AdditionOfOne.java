public class AdditionOfOne {

    public int[] atIndexZero( int length)
    {
        int[] newDigits = new int[length+1];
        newDigits[0] = 1;
        return newDigits;
    }
    public int[] plusOne(int[] digits) {
        int endIndex = digits.length-1;
        ++digits[endIndex];
        while(digits[endIndex] > 9 && endIndex > 0)
        {
            digits[endIndex] -= 10;
            digits[endIndex - 1] += 1;
            --endIndex;
        }
        if(endIndex ==0 && digits[endIndex] > 9){
            return atIndexZero(digits.length);
        }
        for(int j : digits)
        {
            System.out.println(j);
        }
        return digits;
    }
}
