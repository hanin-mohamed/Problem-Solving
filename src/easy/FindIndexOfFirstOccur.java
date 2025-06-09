package easy;

import static java.lang.Math.max;

public class FindIndexOfFirstOccur {
    public int lengthOfLastWord(String s){
        int len=0;
        int i=s.length()-1;
        while (i>=0 && s.charAt(i)==' '){i--;}

        while (i>=0 && s.charAt(i)!=' '){
            len++;
            i--;
        }
        return len;
    }
    public static void main(String args[]) {
    FindIndexOfFirstOccur f = new FindIndexOfFirstOccur();
        System.out.println(f.lengthOfLastWord( "Hello World"));
    }
}
