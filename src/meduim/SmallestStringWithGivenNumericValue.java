package meduim;


import static java.lang.Math.min;

public class SmallestStringWithGivenNumericValue {
/*    public String getSmallestString(int n, int k) {

        StringBuilder sb = new StringBuilder();
        for (int i = n; i >=1&&k>0 ; i--) {
            int x= min(26,k-i+1);
            System.out.println("k: "+k+" x: "+x);
            sb.append((char)('a'+x-1));
            k-=x;
        }
        return sb.reverse().toString();
    }*/
        public String getSmallestString(int n, int k) {

            k-=n;
            char[] arr = new char[n];
            for (int i = n-1; i >=0; i--) {
                if(k>25){
                    arr[i] = 'z';
                    k-=25;
                }else{
                    arr[i] = (char)('a'+k);
                    k=0;
                }
            }

            return new String(arr);

        }

    public static void main(String[] args) {
        SmallestStringWithGivenNumericValue obj = new SmallestStringWithGivenNumericValue();
        System.out.println(obj.getSmallestString(5,73));
        System.out.println(obj.getSmallestString(3,27));

    }
}
