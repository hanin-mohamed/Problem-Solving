package easy;

import java.util.*;

public class Check_If_N_and_Its_Double_Exist {

    // Iterative Solution
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) return true;
            }
        }
        return false;
    }

    // HashSet
    public boolean checkIfExist2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num) || set.contains(num / 2) && num % 2 == 0) return true;
            set.add(num);
        }
        return false;
    }



    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(new Check_If_N_and_Its_Double_Exist().checkIfExist(arr));
    }
}
