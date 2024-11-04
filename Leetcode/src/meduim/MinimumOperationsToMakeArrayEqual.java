package meduim;

public class MinimumOperationsToMakeArrayEqual {
    public int minOperations(int n) {
        int sumOfArr= n*n;
        int target = sumOfArr/n;
        int sum2=(n/2)*(n/2);
        return  n%2==0?sumOfArr/2-sum2 : (sumOfArr-target)/2-sum2;
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeArrayEqual m = new MinimumOperationsToMakeArrayEqual();
        System.out.println(m.minOperations(1));
    }
}
