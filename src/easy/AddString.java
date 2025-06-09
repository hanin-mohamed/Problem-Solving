package easy;

import static java.lang.Math.*;

public class AddString {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder tot=new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
           int x = (i>=0)?num1.charAt(i--)-'0' : 0;
           int y = (j>=0)?num2.charAt(j--)-'0' :0 ;
           int sum=x+y+carry;
           carry=sum/10;
           tot.append(sum%10);
        }
       return tot.reverse().toString();
    }
    public static void main(String[] args) {
        AddString addString=new AddString();
        System.out.println(addString.addStrings("17","35"));
    }

}
