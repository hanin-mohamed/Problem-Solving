package meduim;

import java.util.*;

public class TopKfreq {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int[] ans = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            ans[i]=entry.getKey();
            i++;
            if (i == k) break;
        }
        return ans;
    }

    public static void main(String[] args) {
        TopKfreq topKfreq = new TopKfreq();
       int[] arr = topKfreq.topKFrequent(new int[]{1,2,66,66}, 2);
       System.out.println(Arrays.toString(arr));
    }
}
