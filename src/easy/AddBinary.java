package easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder tot=new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int x = (i>=0)?a.charAt(i--)-'0' : 0;
            int y = (j>=0)?b.charAt(j--)-'0' :0 ;
            int sum=x+y+carry;
            tot.append(sum%2);
            carry=sum/2;

        }
        return tot.reverse().toString();
    }
    public static void main(String[] args) {
        AddBinary a=new AddBinary();
        System.out.println(a.addBinary("1010", "1011"));
    }
}
