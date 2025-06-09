package easy;

public class ReverseWords {
    public String reverseWords(String s) {
       char[] chars = s.toCharArray();
       int l =0,r=0,len=s.length();
       while(l<len) {
           while (l < len && chars[l] != ' ') l++;
           rev(chars, r, l-1);
           l++;
           r = l;
       }
       return new String(chars);
    }
    public void rev(char[]a, int r,int l){
        while (r < l) {
            char tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            r++;
            l--;
        }
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("Let's take LeetCode contest"));
    }
}
