package easy;

import java.util.*;

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        if(strs==null &&strs.length==0) return "";
      Arrays.sort(strs);
      String prefix = strs[0],end = strs[strs.length-1];
      int i=0;
      while(i<prefix.length()&&prefix.charAt(i)==end.charAt(i)){i++;}
      return prefix.substring(0,i);
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"ab","a"}));
    }
}
