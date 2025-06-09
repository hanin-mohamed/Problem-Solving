package easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for (int i = n-1; i >=0; i--) {
            digits[i]++;
                if (digits[i]<10){
                   return digits;
                }
                digits[i]=0;
            }
        int nums[]= new int[n+1];
        nums[0]=1;
        return nums;
    }

    public static void main(String args[]){
        PlusOne plusOne= new PlusOne();
       System.out.println(plusOne.plusOne(new int[]{4,5,6,6,9}));
    }
}
