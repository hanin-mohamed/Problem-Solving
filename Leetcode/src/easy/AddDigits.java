package easy;

public class AddDigits {
    public int addDigits(int num) {
        while(num>9){
          int x=num;num=0;
          while (x>0){
              num+=x%10;
              x=x/10;
          }
        }
        return num;
    }
    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(11));
        System.out.println(addDigits.addDigits(38));
        System.out.println(addDigits.addDigits(888));

    }
}
