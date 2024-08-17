package easy;

public class HappyNum {
    public boolean isHappy(int n) {
        if (n==1 || n==7)return true;
     while (n>9) {
         int sum = 0;
         while (n > 0) {
             sum += (n% 10) * (n % 10);
             n = n / 10;
         }
         if (sum==1)return true;
         n=sum;
     }
        if (n==1 || n==7)return true;

        return false;
    }
    public static void main(String[] args) {
        HappyNum h = new HappyNum();
        System.out.println(h.isHappy(2));
    }
}
