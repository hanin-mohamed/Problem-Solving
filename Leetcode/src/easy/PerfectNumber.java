package easy;

import static java.lang.Math.sqrt;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num==1)return false;
        int tot=1;
        for (int i = 2; i <=sqrt(num) ; i++) {
            if (num%i==0)tot+=((num/i)+i);
        }
        return tot==num;
    }
    public static void main(String args[]){
        PerfectNumber perfectNumber =new PerfectNumber();
        System.out.println(perfectNumber.checkPerfectNumber(7));
    }
}
