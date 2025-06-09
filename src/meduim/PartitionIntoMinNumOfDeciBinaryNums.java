package meduim;

import java.util.Arrays;

public class PartitionIntoMinNumOfDeciBinaryNums {


  /*  public int minPartitions(String n) {
        char[] s = n.toCharArray();
        Arrays.sort(s);

        return s[s.length-1] - '0';
    }*/

    // optimal Solution
    public int minPartitions(String n) {
            for (int i = 9; i >=1 ; i--) {
                if (n.contains(String.valueOf(i))) {
                    return i;
                }
            }
            return 1;
}

    public static void main(String[] args) {
        PartitionIntoMinNumOfDeciBinaryNums obj = new PartitionIntoMinNumOfDeciBinaryNums();
        System.out.println(obj.minPartitions("232"));

    }
}
